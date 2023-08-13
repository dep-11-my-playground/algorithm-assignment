import java.util.Scanner;

public class Algo_5 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String input;
        do {
            System.out.print("Enter a text: ");
            input = scanner.nextLine();
            
        }while(input.isBlank());

        char[] chars = input.toCharArray();

        String output = "";
        for (int i = chars.length-1; i >=0; i--) {
            output += chars[i];
        }

        System.out.println(output);

    }
}
