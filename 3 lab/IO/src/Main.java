import Search.*;

public class Main {
    public static void main(String[] args) {
        /*
        String path = "IO.txt";
        File_Reader fileReader = new File_Reader("IO.txt");
        System.out.println(fileReader.getString());
        File_Writer file_writer = new File_Writer(path);
        file_writer.writeString("qweqwessdsdd");
        file_writer.writeString("qweqwessdsdasdsdd");
        File_Reader fileReader1 = new File_Reader("IO.txt");
        System.out.println(fileReader1.getString());
        File_Writer.Unite2Files(file_writer, new File_Writer("IS.txt"), "QW.txt");
        (new CopyFile(path)).copyFile("IK.txt");*/
        String path1 = "C:\\Users\\Lamer\\Desktop\\RMP\\3 lab\\IO";
        try {
            System.out.println((new SearchForStringInFiles(path1)).search("asd"));
        }
        catch (DirException exception)
        {
            exception.printStackTrace();
        }

    }
}
