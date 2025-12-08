package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[]args){
        int[] nums =  {4,5,2,1,3,0};
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums.length -1-i;j++){
            if(nums[j] > nums[j+1]) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
