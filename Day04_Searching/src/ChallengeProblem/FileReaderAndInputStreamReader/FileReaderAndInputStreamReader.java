package ChallengeProblem.FileReaderAndInputStreamReader;

public class FileReaderAndInputStreamReader {
    public static void main(String[] args) {
        String filePath = "src/ChallengeProblem/FileReaderAndInputStreamReader/file.txt";

        Compare.writeTofile(filePath);

        long fileReaderTime = Compare.fileReaderTime(filePath);
        long inputStreamReaderTime = Compare.inputStreamReaderTime(filePath);

        System.out.println("Time taken by FileReader is: " + fileReaderTime);
        System.out.println("Time taken by InputStreamReader is: " + inputStreamReaderTime);
        System.out.println("Time difference between InputStreamReader and FileReader is: " + (fileReaderTime-inputStreamReaderTime));
    }
}
