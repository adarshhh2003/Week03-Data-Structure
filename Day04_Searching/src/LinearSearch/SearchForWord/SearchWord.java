package LinearSearch.SearchForWord;

public class SearchWord {
    public static String findWord(String[] arr, String targetWord) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i].contains(targetWord)) {
                return arr[i];
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {
        String[] arr = {"Java is a powerful programming language.",
                "Git is a version control system.",
                "Machine learning is fascinating.",
                "Cloud computing is the future.",
                "Open-source software is widely used."};
        String targetWord = "Git";

        String result = findWord(arr, targetWord);

        System.out.println("The sentence for the " + targetWord + " word is: " + result);
    }
}
