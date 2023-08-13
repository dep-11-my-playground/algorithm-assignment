import java.util.Scanner;

public class Algo_6 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String input;
        loop:
        do {
            System.out.print("Enter a sentence: ");
            input = scanner.nextLine();
            char[] chars = input.toCharArray();
            String[] strArray = input.split(" ");
            String output = "";

            if(input.isBlank()){
                System.out.println("The sentence is empty...Please enter a valid sentence!");
                continue loop;
            }

            for (int i = 0; i < chars.length; i++) {
                int c = chars[i];
                if (c < 0 || c > 128 ){
                    System.out.println("The sentence has included non ASCII characters..Please enter a valid sentence!");
                    continue loop;
                    
                }else {

                    for (int j = strArray.length -1 ; j >= 0; j--) {
                        output += strArray[j] + " ";
                    }

                }  
                System.out.println("Reversed sentence: " + output);
                break loop;     
            }
            
            
        }while(true);

    }
}
