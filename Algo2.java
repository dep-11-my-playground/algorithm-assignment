public class Algo2 {
    public static void main(String[] args) {
        
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23} ;

        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

          if (n > max) max = n;
            
          if (n < min) min = n;
        }
        System.out.println("Larger number in the set: " + max);
        System.out.println("Smallest number in the set: " + min);
        
        
    }
}
