import Search.*;
import WR.File_Reader;
import WR.File_Writer;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws DirectException {
        String path = "IOs.txt";
//        File_Reader fileReader = new File_Reader("IO.txt");
//        System.out.println(fileReader.getString());
        File_Writer<String> file_writer = new File_Writer(path);
        file_writer.writeString("qweqwessdsdd", true);
//        file_writer.writeString("qweqwessdsdasdsdd", true);
//        File_Reader fileReader1 = new File_Reader("IO.txt");
//        System.out.println(fileReader1.getString());
////        File_Writer.Unite2Files(file_writer, new File_Writer("IS.txt"), "QW.txt");
//        (new CopyFile(path)).copyFile("IK.txt");


        String path1 = "C:\\Users\\Lamer\\Desktop\\RMP\\3 lab\\IO";
        SearchForStringInFiles stringInFiles = new SearchForStringInFiles(path1);
//        try {
//            System.out.println((stringInFiles).search("asd"));
//        }
//        catch (DirectException exception)
//        {
//            exception.printStackTrace();
//        }
//        Predicate<String> check= x->x.contains("sdahj");
//        System.out.println(stringInFiles.searchwithLambda(check));


    }
}
