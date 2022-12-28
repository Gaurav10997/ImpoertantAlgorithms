public class subArray {
    public static void main(String[] args) {
        int arr [] = {-1,-2,-3,-3,-1,-5};
//        System.out.println(maxSubArraySumPrefix(arr));
//        printSubArraySum(arr);
        System.out.println(maxSubArraySumKadanes(arr));
    }
    static void printSubArraySum(int [] arr ){
        int n = arr.length;
        //first loop just focusing on the starting point ;
        for(int i = 0 ; i< n ; i++){
            //second loop just focusing on the ending point
            for(int j = i ; j<n ; j++){
                //this loop is just for printing the suarrays
                for(int k = i ; k<=j ; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }

        }
    }
    static int maxSubArraySum (int[] arr ){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0 ; i< n ; i++){
            for(int j = i ; j<n ; j++){
                cs=0;
                for(int k = i ; k<=j ; k++){
                    cs+=arr[k];
                }
                if(cs>max){
                    max=cs;
                }
            }
        }
        return max;
    }
    static int maxSubArraySumPrefix (int[] arr ){
        int [] prefix = new int[arr.length];
        //Creating the prefix array
        prefix[0]=arr[0];
        for(int i = 1 ; i< arr.length ; i++){
            prefix[i]=arr[i]+prefix[i-1];
        }

        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0 ; i< n ; i++){
            for(int j = i ; j<n ; j++){
                //just skipping on of the loops just by using prefix sum ;
                cs = i==0?prefix[j]: prefix[j]-prefix[i-1];
                if(cs>max){
                    max=cs;
                }
            }
        }
        return max;
    }

    static int maxSubArraySumKadanes(int a[])
    {
        int size = a.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < size; i++) {
            currSum = currSum + a[i];
            if (maxSum < currSum)
                maxSum = currSum;

            if (currSum < 0)
                currSum = 0;
        }
        return maxSum;
    }


}
