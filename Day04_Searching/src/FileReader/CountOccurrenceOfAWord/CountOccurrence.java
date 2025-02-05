package FileReader.CountOccurrenceOfAWord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurrence {
    public static int findOccurrence(String filePath, String targetWord) {

        int count = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String[] words;
            String line;
            StringBuilder sb = new StringBuilder();

            while((line=br.readLine())!=null) {
                sb.append(line+" ");
            }

            words = sb.toString().split("\\s");
            for(int i=0; i<words.length; i++) {
                if(words[i].equals(targetWord)) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return count;
    }

    public static void main(String[] args) {
        String filePath = "src/FileReader/CountOccurrenceOfAWord/file.txt";
        String targetWord = "hello";
        int count = findOccurrence(filePath, targetWord);

        System.out.println("The occurrence of the word " + targetWord + " is: " + count);
    }
}
