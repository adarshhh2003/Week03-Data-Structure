package LargeFileReading;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/LargeFileReading/file.txt";

        LargeFileReading r1 = new LargeFileReading(filePath, 2000);
        r1.fileReaderTime();
        r1.inputStreamReader();
        System.out.println();

        LargeFileReading r2 = new LargeFileReading(filePath, 50000);
        r2.fileReaderTime();
        r2.inputStreamReader();
        System.out.println();

        LargeFileReading r3 = new LargeFileReading(filePath, 250000);
        r3.fileReaderTime();
        r3.inputStreamReader();
    }
}
