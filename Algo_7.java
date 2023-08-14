import java.util.Scanner;

public class Algo_7 {

    private static final Scanner scanner =  new Scanner(System.in);
    public static void main(String[] args) {

        String input;

        do {

            System.out.print("Enter a sentence: ");
            input = scanner.nextLine();

        }while(input.isBlank());

        String[] words = input.split(" ");
        int maxLength = words[0].length();
        int minLength = words[0].length();
        String longestWord = "";
        String smallestWord = "";


        for (int i = 0; i < words.length; i++) {
            String word = words[i]; 

            if (maxLength < word.length()){
                maxLength = word.length();
                longestWord = words[i] + ",";

            } else if (maxLength == word.length()){
                longestWord =words[i] + "," + longestWord;
            }
            
            if (minLength > word.length()){
                minLength = word.length();
                smallestWord = words[i] + ",";

            } else if(minLength == word.length()){
                smallestWord = words[i] + "," + smallestWord;

            }
        }


        System.out.println("longest word's length: " + maxLength);
        System.out.println("Smallest word's length: " + minLength);
        System.out.println("Longest word/words: "  +longestWord + "\b ");  
        System.out.println("Smallest word/words: " + smallestWord + "\b ");      

    }
}
