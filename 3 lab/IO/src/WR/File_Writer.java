package WR;

import java.io.*;
import java.util.ArrayList;

public class File_Writer {
    private String path;

    public File_Writer(String path) {
        this.path = path;
    }

    public void writeString(String string){
        try(FileWriter fw =new FileWriter(path, true)) {
            BufferedWriter streamInFile = new BufferedWriter(fw);
            streamInFile.newLine();
            streamInFile.write(string);
            streamInFile.close();
        }catch (FileNotFoundException ex){
            System.out.println(ex);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Unite2Files(File_Writer fw1, File_Writer fw2, String newPath){
        StringBuilder file1 = new File_Reader(fw1.path).getString();
        StringBuilder file2 = new File_Reader(fw2.path).getString();
        String newfile = file1.append(file2).toString();
        try(FileWriter fw = new FileWriter(newPath)){
            BufferedWriter streamInNewFile = new BufferedWriter(fw);
            streamInNewFile.write(newfile);
            streamInNewFile.close();
        }catch (FileNotFoundException fileExc){
            System.out.println(fileExc);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
