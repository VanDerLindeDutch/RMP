package WR;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class File_Reader {
    private List<String> file;
    public File_Reader(String path)
    {
        try {
            file = new ArrayList<>();
            BufferedReader streamFile = new BufferedReader(new FileReader(path));
            while (streamFile.ready()){
                file.add(streamFile.readLine());
            }
        }catch (FileNotFoundException ex){
            System.out.println(ex);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getFile() {
        if(file == null)
        {
            System.out.println("NULL");
        }
        return file;
    }

    public StringBuilder getString(){
        StringBuilder sb = new StringBuilder();
        for(String i:file){
            sb.append(i);
            sb.append('\n');
        }
        return sb;
    }
}
