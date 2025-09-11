import java.util.Collections;
import java.util.Arrays;


public class sortArrOfZeroOneTwos_2 {
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,0,0};
       int result [] = sortArray(arr);
       for(int i = 0; i<result.length; i++){
        System.out.println(result[i]);
        
       }
    }

    // Brute
    // static int[] sortArray(int arr[]){
    //     Arrays.sort(arr);
    //     return arr;
        
    // }

    // using dutch national flag algorithm


    static int [] sortArray(int arr[]){
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
        return arr;
    }
    
}