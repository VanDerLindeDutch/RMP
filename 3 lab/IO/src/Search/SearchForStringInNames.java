package Search;

import WR.File_Reader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchForStringInNames implements ForSearchers {
    private String path;

    public SearchForStringInNames(String path) {
        this.path = path;
    }


    @Override
    public List<String> search(String stringToSearch) throws DirectException {
        File dir = new File(path);
        List<String> names = new ArrayList<>();
        if (!dir.isDirectory()) {
            throw new DirectException("The path doesn't points to the directory");
        }
        File[] allFiles = dir.listFiles();
        for (File i : allFiles) {
            if (i.getName().contains(stringToSearch)) {
                names.add(i.getName());
            }
        }
        return names;
    }


    public List<String> searchwithLambda(Predicate<String> predicate) throws DirectException {
        File dir = new File(path);
        List<String> names = new ArrayList<>();
        if (!dir.isDirectory()) {
            throw new DirectException("The path doesn't points to the directory");
        }
        File[] allFiles = dir.listFiles();
        for (File i : allFiles) {
            if (predicate.test(i.getName())) {
                names.add(i.getName());
            }
        }
        return names;
    }
}
