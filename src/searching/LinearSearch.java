package searching;

public class LinearSearch {
    public static void main(String[]args){
        int[] nums = {5, 2, 9, 1, 7, 6, 3};
        int target = 10;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                System.out.println("element found in "+i + " position");
                return;
            }
        }
            System.out.println("element not found");
    }
}
