public class maximumSubarraySum_4 {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = maxSubarraySum(arr);
        System.out.println("maximum sum of subarray is : "+maxSum);
        
    }

    // brute force approach TC->O(n^2)

    // static int maxSubarraySum(int arr[]){
    //     int n = arr.length;
    //     int maxi = arr[0];
    //     for(int i  = 0; i<n; i++){
    //         int sum  = 0;
    //         for(int j = i; j<n; j++){
    //             sum += arr[j];
    //             maxi = Math.max(sum, maxi);

    //         }
    //     }
    //     return maxi;
    // }

    // optimal approach using kadane's algorithm
    static int maxSubarraySum(int arr[]){
        int n = arr.length;

        int sum = 0;
        int maxi = arr[0];
        for(int i = 0; i<n; i++){
            sum += arr[i];
            maxi = Math.max(maxi,sum);

            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
    
}