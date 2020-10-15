package Search;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchForStringInNames implements ForSearchers{
    private String path;

    public SearchForStringInNames(String path) {
        this.path = path;
    }


    @Override
    public List<String> search(String stringToSearch) throws DirException {
        File dir = new File(path);
        List<String> names= new ArrayList<>();
        if (!dir.isDirectory()) {
            throw new DirException("The path doesn't points to the directory");
        }
        File[] allFiles = dir.listFiles();
        for (File i : allFiles) {
            if (i.getName().contains(stringToSearch)) {
                names.add(i.getName());
            }
        }
        return names;
    }
}
