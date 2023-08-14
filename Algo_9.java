import java.util.Scanner;

public class Algo_9 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String input;

        do{

            System.out.print("Enter a word: ");
            input = scanner.next();
            if (!scanner.nextLine().trim().isEmpty()){
                System.out.println("Please enter one word!");
                continue;
            } 

            String reversedString = "";
            char[] chars = input.toCharArray();

            for (int i = chars.length-1; i >= 0; i--) {
                reversedString += chars[i];
            }

            if (input.equals(reversedString)){
                System.out.println("The word is a palindrome");

            }else {
                System.out.println("The word is not a palindrome");
            }

            //break;


        }while(true);


    }
}
