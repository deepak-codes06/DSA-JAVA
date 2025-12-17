package Sortings;

import java.util.Arrays;



public class insertionSort {
    public static void main(String[] args){
        int[] arr = {5,3,2,0,1};
        sorting(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sorting(int[] arr){
        for(int i = 0; i < arr.length - 1; i++ ){ // it is goning to run till arr.length - 2
             for(int j = i + 1; j > 0; j--){
                 if(arr[j] < arr[j-1]){
                     swap(arr,j,j-1);
                 }else{
                     break;
                 }
             }
        }
    }
    public static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
