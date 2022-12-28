import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={1,6,5,4,3};
        System.out.println(Arrays.toString(bubble(arr)));

    }

    static int []  bubble(int [] arr ){
        for(int i = 0 ; i< arr.length-1 ; i++){
            for(int j = 0 ; j<arr.length -i -1 ; j++)
                if(arr[j]>arr[j+1]){
                    swap(arr , j,j+1);

                }
        }
        return arr;
    }
    static void swap(int [] arr ,int a , int b){
        int temp = arr[a] ;
        arr[a] = arr[b] ;
        arr[b] = temp;
    }
}
