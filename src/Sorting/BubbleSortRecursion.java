package Sorting;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[]args){
        int[] nums = {5,4,3,2,1};
        int i=0;
        bubbleSort(nums, i);
        System.out.println(Arrays.toString(nums));
    }
    public static void bubbleSort(int[] nums, int i){
        if(i == nums.length){
            return;
        }
        if(nums[i ]> nums[i+1]){
            int temp = nums[i];
            nums[i]  = nums[i+1];
            nums[i+1] = temp;
        }
        bubbleSort(nums, ++i);
    }
}
