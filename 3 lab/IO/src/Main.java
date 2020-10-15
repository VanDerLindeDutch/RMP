public class Main {
    public static void main(String[] args) {
        String path = "IO.txt";
        File_Reader fileReader = new File_Reader("IO.txt");
        System.out.println(fileReader.getString());
        File_Writer file_writer = new File_Writer(path);
        file_writer.writeString("qweqwessdsdd");
        file_writer.writeString("qweqwessdsdasdsdd");
        File_Reader fileReader1 = new File_Reader("IO.txt");
        System.out.println(fileReader1.getString());
        File_Writer.Unite2Files(file_writer, new File_Writer("IS.txt"), "QW.txt");
    }
}
