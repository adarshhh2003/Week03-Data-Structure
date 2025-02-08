package LargeFileReading;

import java.io.*;

public class LargeFileReading {
    String filePath;

    LargeFileReading(String filePath, int n) {
        this.filePath = filePath;

        try(FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String line = "hello, my  name is name, what is your name, can you please tell me ";
            for(int i=0; i<n; i++) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void fileReaderTime() {
        long start = System.nanoTime();
        try(FileReader fileReader = new FileReader(filePath)) {
            int i;
            while((i=fileReader.read()) != -1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        long end = System.nanoTime();
        double difference = end-start;

        System.out.println("The time used by FileReader is: " + difference / 1000000.0 + " ms");

    }

    public void inputStreamReader() {
        long start = System.nanoTime();
        try(InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
            int i;
            while((i=inputStreamReader.read()) != -1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        long end = System.nanoTime();
        long difference = end-start;

        System.out.println("The time used by InputStreamReader is: " + difference / 1000000.0 + " ms");

    }
}
