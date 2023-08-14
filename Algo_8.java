
public class Algo_8 {
    public static void main(String[] args) {
        
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        String intersection ="";
        String setA = "";
        String setB ="";
        String union ="";
        String diffOfAandB ="";
        String diffOfBandA ="";

        int[] numA2= {5, 7, -2, 3, 4, 6, -8};
        int[] numB2 = {7, 8, -8, 2, 1, -9, 6};
        
        for (int i = 0, k =0; i < numA.length; i++, k++) {
            int n = numA[i];
            setA += n + ", ";

            if (k < numB.length) {
                setB += numB[k] + ", ";
            }

            for (int j = 0; j < numB.length; j++) {
                if (numB[j] == n){
                    intersection += n + ", ";
                    numA2[i] = 0;
                    numB2[j] = 0;
                }                 
            }
            union = setA + setB;  
        }        

        for (int i = 0, j =0; i < numA2.length; i++, j++) {
            if (numA2[i] != 0) diffOfAandB += numA2[i] + ", ";
            if (j < numB2.length){
                if(numB2[j] != 0) diffOfBandA += numB2[i] + ", ";
            }
        }
        
        System.out.println("numA \u2229 numB: " + "{" + intersection +"\b\b" + "}");
        System.out.println("numA \u222A numB: " +"{"+ union + "\b\b" + "}");
        System.out.println("numA / numB: " +"{"+ diffOfAandB + "\b\b" + "}");
        System.out.println("numB / numA: " +"{"+ diffOfBandA + "\b\b" + "}");
        System.out.println("numA ∆ numB: " +"{"+ diffOfAandB + diffOfBandA + "\b\b" + "}");

    }
}
