import java.util.ArrayList;
import java.util.Arrays;

public class twoSum_1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int target = 8;
        int[] result = twoSum(arr,target);
        System.out.println(Arrays.toString(result));
        
    }

    static int[] twoSum(int arr[], int target){


        int n = arr.length;

        int left = 0;
        int right = n-1;
        int sum = 0;

        while(left < right){
            sum = arr[left] + arr[right];

            if(sum == target){
                  return new int[] {left,right};
            }
            else if(sum < target){
                left++;
            }
            else if (sum > target){
                right --;
            }
        }
     return new int[]{};
       
    }
    
}