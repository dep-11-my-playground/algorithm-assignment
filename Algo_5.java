import java.util.Scanner;

public class Algo_5 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String input;
        String output = "";
        loop:
        do {
            System.out.print("Enter a text: ");
            input = scanner.nextLine();
            char[] chars = input.toCharArray();

            if(input.isBlank()){
                System.out.println("The text is empty...Please enter a valid text!");
                continue loop;
            }

            for (int i = chars.length-1; i >=0; i--) {
                int c = chars[i];
                if (c < 0 || c > 128 ){
                    System.out.println("The text has included non ASCII characters..Please enter a valid text!");
                    continue loop;
                    
                }else {
                    output += chars[i];   
                }       
            }
            System.out.println("Reversed text: " + output);
            break;
            
        }while(true);

    }
}
