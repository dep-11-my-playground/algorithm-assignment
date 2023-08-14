import java.util.Scanner;

public class Algo_10 {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String phoneNum;
        do{

            System.out.print("Enter a phone number: ");
            phoneNum = scanner.nextLine();
            if (phoneNum.isBlank()) System.out.println("Phone number can't be empty!");

        } while(phoneNum.isBlank());

        char[] chars = phoneNum.toCharArray();

        

        if(phoneNum.startsWith("+94")){
            if(chars[3] == ' ' && chars[6] == ' ' && chars[10]== ' '){
                for (int i = 4; i < chars.length; i++) {
                    if (i==3 || i == 6 || i == 10) continue;
                    if (Character.isDigit(chars[i])){
                        System.out.println("Phone numeber is validated!");
                        break;
                    }else System.out.println("Invalid phone number");
                }
            }else System.out.println("Invalid phone number!");
            
        }else if(phoneNum.startsWith("0")){
            if(chars[3] == '-'){
                for (int i = 4; i < chars.length; i++) {
                    if (Character.isDigit(chars[i])){
                        System.out.println("Phone number is validated!");
                        break;
                    }else if (!Character.isDigit(chars[i])) System.out.println("Invalid phone number!");
                    else System.out.println("Invalid phone number");
                }
            }else System.out.println("Invalid phone number!");
            
        }else {
            System.out.println("Invalid phone number!");
        }
        
        
            
        

    }
}
