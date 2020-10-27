package WR;

import java.io.*;
import java.util.ArrayList;

public class File_Writer<T> {
    private final String path;

    public File_Writer(String path) {
        this.path = path;
    }

    public void writeString(T string, boolean A){
        try(FileWriter fw =new FileWriter(path, A)) {
            BufferedWriter streamInFile = new BufferedWriter(fw);
            streamInFile.newLine();
            streamInFile.write(string.toString());
            streamInFile.close();
        } catch (IOException ex){
            ex.printStackTrace();
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
