import java.util.HashMap;

public class maximumSubarraySum_11 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,5,8};
        int k = 17;
        int res = lenOfMaxSubarraySum(arr,k);
        System.out.println("length of the maximum subarray is: "+res);
        
    }

    // better approach using map
    // static int lenOfMaxSubarraySum(int arr[],int k){
    //     int n = arr.length;
    //     int sum = 0;
    //     int maxLen = 0;
    //     HashMap<Integer,Integer> presummap = new HashMap<>();
    //     for(int i = 0; i<n; i++){
    //         sum += arr[i];
    //         if(sum == k){
    //             maxLen = Math.max(maxLen, i+1);
    //         }

    //         int rem = sum - k;

    //         if(presummap.containsKey(rem)){
    //             int len = i - presummap.get(rem);
    //             maxLen = Math.max(maxLen,len);
    //         }

    //         if(!presummap.containsKey(sum)){
    //             presummap.put(sum,i);
    //         }
    //     }

    //     return maxLen;

    // }

    static int lenOfMaxSubarraySum(int arr[], int k){
        int n = arr.length;
        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for(int right = 0; right<n; right++){
            sum += arr[right];

            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }

            if(sum == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;
    }
    
}