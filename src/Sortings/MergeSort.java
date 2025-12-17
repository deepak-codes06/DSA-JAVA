package Sortings;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] arr = new int[] {5,4,3,2,1};
        int[] ans = sorting(arr);
        System.out.print(Arrays.toString(ans));
    }
    public static int[] sorting(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = sorting(Arrays.copyOfRange(arr,0,mid));
        int[] rigth = sorting(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,rigth);
    }
    public static int[] merge(int[] first , int[] second){
        int[] newArr = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while( i < first.length && j < second.length){
            if(first[i] < second[j]){
                newArr[k] = first[i];
                i++;
            }else{
                newArr[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length){
            newArr[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            newArr[k] = second[j];
            j++;
            k++;
        }

        return newArr;

    }
}
