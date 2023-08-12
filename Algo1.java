import java.util.Scanner;

public class Algo1 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int num;
        do{
            System.out.print("Enter a number: ");
            num = scanner.nextInt();
            scanner.nextLine();

            if (num < 1) System.out.println(" Wrong input! please enter a positive number");
            
        } while(num <1);

        int i = 0;
        int output = 0;
        int num1 = 0;
        int num2 = 1;
        String str = num1+"," + num2 + ",";
        
        do{           
                
            if (num > 1){
                output = num1 + num2;
                if (output >= num ){
                    break;
                } 
                num1 = num2;
                num2 = output;
                str += output + ",";
            }
                
            i++;            

        } while (i < num);
            System.out.println("Fibonacci sequence: " + str + "\b ");
               
    }
}
