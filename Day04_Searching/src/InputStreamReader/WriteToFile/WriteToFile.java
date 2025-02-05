package InputStreamReader.WriteToFile;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
        String filePath = "src/InputStreamReader/WriteToFile/file.txt";

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Type exit to stop writing");
            String line;
            while(true) {
                line = bufferedReader.readLine();
                if(line.equalsIgnoreCase("exit")) {
                    break;
                }

                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

            inputStreamReader.close();
            bufferedReader.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
