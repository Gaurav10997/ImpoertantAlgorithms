public class kadanesAlgorithm {
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4,-5};
        System.out.println((KadanesAlgo(arr)));
    }
    static int KadanesAlgo(int[] arr){
        int currSum = 0 ;
        int maxSum =Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length ; i++){
            currSum+=arr[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
}
