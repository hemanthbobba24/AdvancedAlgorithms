package searching;
public class BinarySearch{
    public static void main(String[]args){
        int[] nums = {1,2,3,4,5,6,7,8};
        int start = 0;
        int end = nums.length-1;
        int target = 2;
        binarySearch(nums, start, end, target);
    }
    public static void binarySearch(int[] nums, int start, int end, int target){
        if(end < start){
            System.out.println("element not found");
            return;
        }
        int mid = start+(end-start)/2;
        if(target == nums[mid]){
            System.out.println("element found in "+mid + " position");
            return;
        }
        if(target > nums[mid]){
            binarySearch(nums, mid+1, end, target);
        }else {
            binarySearch(nums, start, mid - 1, target);
        }
    }
}