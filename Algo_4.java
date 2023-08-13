public class Algo_4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        for (int i = nums.length - 1, j = 0 ; j < nums.length/2; i--, j++) {

            int n = nums[j];
            nums[j] = nums[i];
            nums[i] = n;
        }

        String output = "["; 
        
        for (int i = 0; i < nums.length; i++) {
            output += nums[i] + ", ";
        }

        System.out.println(output + "\b\b" + "]");
    }
}
