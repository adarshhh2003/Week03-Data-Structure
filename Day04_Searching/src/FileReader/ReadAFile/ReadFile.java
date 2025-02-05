package FileReader.ReadAFile;
import java.io.*;

class ReadFile{
    public static void main(String[] args) {
        String filePath = "src/FileReader/ReadAFile/file.txt";
        File file = new File(filePath);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String result;

            while((result = br.readLine()) != null) {
                System.out.println(result);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
