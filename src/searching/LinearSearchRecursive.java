package searching;

public class LinearSearchRecursive {
    public static void main(String[]args){
        int[] nums = {5,2,9,1,7,6,3};
        int target = 3;
        int i=0;
        linearSearch(nums, target, i);
    }
    public static void linearSearch(int[] nums, int target, int i){
        if(i>= nums.length){
            System.out.println("element not found");
            return;
        }
        if(nums[i] == target){
            System.out.println("element found at "+i+" position");
            return;
        }
            linearSearch(nums, target, i+1);
    }
}
