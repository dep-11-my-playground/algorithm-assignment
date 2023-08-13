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
        int maxLength = words[0].toCharArray().length;;
        int minLength = words[0].toCharArray().length;
        String longestWord = "";
        String smallestWord = "";


        for (int i = 0; i < words.length; i++) {
            char[] charsInAWord = words[i].toCharArray(); 

            if (maxLength < charsInAWord.length){
                maxLength = charsInAWord.length;
                longestWord = words[i];

            } else if (maxLength == charsInAWord.length){
                longestWord =words[i] + ", " + longestWord;
            }
            
            if (minLength > charsInAWord.length){
                minLength = charsInAWord.length;
                smallestWord = words[i];

            } else if(minLength == charsInAWord.length){
                smallestWord = words[i] + ", " + smallestWord;

            }
        }


        System.out.println("longest word's length: " + maxLength);
        System.out.println("Smallest word's length: " + minLength);
        System.out.println("Longest word/words: "  +longestWord);  
        System.out.println("Smallest word/words: " + smallestWord);      

    }
}
