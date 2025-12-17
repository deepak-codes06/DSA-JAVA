package Sortings;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] {5,4,3,2,1};
        sorting(arr,0,arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }
    static void sorting(int[] arr , int low , int hi){
        if(low >= hi){
            return;
        }


        int s = low;
        int end = hi;
        int mid = s + (end - s) / 2;
        int pivot = arr[mid];

        while(s <= end){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[end] > pivot){
                end--;
            }

            if(s <= end){
                int temp = arr[s];
                arr[s] = arr[end];
                arr[end] = temp;

                s++;
                end--;
            }
        }




        sorting(arr,low,end);
        sorting(arr,s,hi);
    }

}
