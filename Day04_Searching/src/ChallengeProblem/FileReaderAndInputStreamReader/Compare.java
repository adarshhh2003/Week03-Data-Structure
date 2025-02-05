package ChallengeProblem.FileReaderAndInputStreamReader;

import java.io.*;

public class Compare {
    public static void writeTofile(String filePath) {
        try(FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String line = "My name is name";

            for(int i=0; i<10; i++) {
                bufferedWriter.write(line);
                bufferedWriter.flush();
            }

            fileWriter.close();
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static long countWords(String filePath) {
        long count = 0;

        

        return count;
    }

    public static long fileReaderTime(String filePath) {
        long start = 0;
        long end = 0;
        int count = 0;
        try(FileReader fileReader = new FileReader(filePath)) {
            start = System.nanoTime();
            StringBuilder sb = new StringBuilder();
            int i;

            while((i=fileReader.read()) != -1) {
                char ch = (char)i;
                sb.append(Character.toString(ch));
            }

            count += sb.toString().split("\\s").length;
            System.out.println("Word count is: " + count);
            end = System.nanoTime();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return end-start;
    }

    public static long inputStreamReaderTime(String filePath) {
        long start = 0;
        long end = 0;

        try(InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
            start = System.nanoTime();

            int i;

            while((i=inputStreamReader.read()) != -1);

            end = System.nanoTime();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return end-start;
    }
}
