package Sortings;

public class MergeSortInPlace {
    public static void main(String[] args){
      int[] arr = new int[] {5,4,3,2,1};
      divide(arr,0,arr.length-1);
      for(int i = 0; i < arr.length; i++){
          System.out.print(arr[i] + " ");
      }

    }

    public static void divide(int[] arr, int s , int e){
        if(s>=e){
            return;
        }
        int mid  = s + (e  - s) / 2;

        divide(arr, s , mid);
        divide(arr, mid + 1 , e);
        conqure(arr,s,mid,e);
    }

    public static void conqure(int[] arr , int s , int mid ,  int e){
        int[] newArr = new int[e - s + 1];
        int i = s;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= e){
            if(arr[i] < arr[j]){
                newArr[k++] = arr[i++];
           }else{
                newArr[k++] = arr[j++];
            }
        }

        while(i <= mid){
            newArr[k++] = arr[i++];
        }

        while ( j <= e){
            newArr[k++] = arr[j++];
        }

        for(int l = 0 , m = s; l < newArr.length; l++ , m++){
            arr[m] = newArr[l];
        }
    }
}
