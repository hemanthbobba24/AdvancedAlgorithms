package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[]args){
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int[] first = mergeSort(Arrays.copyOfRange(arr, 0, arr.length/2));
        int[] second = mergeSort(Arrays.copyOfRange(arr, arr.length/2, arr.length));
        return merge(first, second);
    }
    public static int[] merge(int[] first, int[] second){
        int merged[] = new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                merged[k] = first[i];
                i++;
                k++;
            }
            else{
                merged[k] = second[j];
                j++;
                k++;
            }
        }
        while(i < first.length){
            merged[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            merged[k] = second[j];
            j++;
            k++;
        }
        return merged;
    }
}
