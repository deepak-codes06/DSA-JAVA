package Sortings;

import java.util.Arrays;

    public class selectionSort {
    public static void main(String[] args){
        int[] arr = {5,6,2,31,4};
        Sorting(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void Sorting(int[] arr){
        for(int i = 0; i<=arr.length-1; i++){
            int last = arr.length-i-1;
             int maxidx = getMaxIdx(arr, 0 , last);

             swap(arr,maxidx,last);
        }




        }

        public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        }

    public static int getMaxIdx(int[] arr, int start,int end){
        int max = start;
        for (int i = start; i<=end; i++){

            if(arr[max] < arr[i])
                max = i;

        }
        return max;
    }


}
