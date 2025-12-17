package Sortings;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        Sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Sorting(int arr[]){
        for(int i = 0; i <= arr.length-1; i++){
            boolean checkSwapped = false;
            for(int j = 1; j<=arr.length-i-1; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    checkSwapped = true;
                }
            }
            if(!checkSwapped){
                break;
            }
        }
    }
}
