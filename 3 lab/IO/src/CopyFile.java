

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    private String path;

    public CopyFile(String path) {
        this.path = path;
    }

    public void copyFile(String newPath) {
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(path));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(newPath));
            byte[] bytes = in.readAllBytes();
            out.write(bytes);
            in.close();
            out.close();
        }catch (FileNotFoundException exc)
        {
            exc.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
