public class Algo3 {
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50};
        int[] newNums = new int[nums.length];

        for (int i = nums.length - 1, j = 0 ; i >= 0; i--, j++) {

            if (j < nums.length){
                newNums[j] = nums[i];

            }  
        }
        nums = newNums; 
        String output = "["; 
        
        for (int i = 0; i < nums.length; i++) {
            output += nums[i] + ", ";
        }

        System.out.println(output + "\b\b" + "]");
    }
}
