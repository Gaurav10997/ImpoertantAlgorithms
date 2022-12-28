import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={1,6,5,4,3};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    static int [] selectionSort(int [] arr){
        int n = arr.length ;
        int index= 0;
        int lastIndex;
        for(int i =0 ; i<n ; i++ ){
            lastIndex=n-i-1;
            int maxIndex=getMaxIndexOf(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
        return arr;
    }
    static void swap(int [] arr ,int a , int b){
        int temp = arr[a] ;
        arr[a] = arr[b] ;
        arr[b] = temp;
    }
    static int getMaxIndexOf(int arr[],int start , int end){
        int maxIndex = 0 ;
        for (int i = 1; i <end ; i++) {
            if(arr[maxIndex]>arr[i]){
                maxIndex=i;
            }
        }
        return maxIndex;

    }
}
