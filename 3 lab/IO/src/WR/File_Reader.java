package WR;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class File_Reader {
    private List<String> file;

    public File_Reader(String path) {
        try (BufferedReader streamFile = new BufferedReader(new FileReader(path))){
            file = new ArrayList<>();
            while (streamFile.ready()) {
                file.add(streamFile.readLine());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public List<String> getFile() throws NullPointerException {
        if (file == null) throw new NullPointerException("NULL");
        return file;

    }

    public StringBuilder getString() {
        StringBuilder sb = new StringBuilder();
        for (String i : file) {
            sb.append(i);
            sb.append('\n');
        }
        return sb;
    }
}
