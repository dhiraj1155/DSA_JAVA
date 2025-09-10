public class find_missingNumber_9 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};

        int missing = findMissing(arr);
        System.out.println("missing number from the array is: "+missing);
        
    }

    // better
    // static int findMissing(int arr[]){
    //     int n = arr.length;
    //     int sum = n*(n+1) / 2;
    //     int s = 0;
    //     for(int i = 0; i<n-1; i++){
    //         s += arr[i];
    //     }
    //     int missing = sum - s;
    //     return missing;
    // }

    // optimal using xor
    static int findMissing(int arr[]){
        int n = arr.length+1;
        int xorArr = 0;
        int xorFull = 0;

        // XOR all elements in the array
        for(int num : arr){
            xorArr ^= num;
        }

        // XOR all numbers from 1 to n
        for(int i = 1; i<=n; i++){
            xorFull ^= i;
        }

        return xorArr ^ xorFull;
    }
    
}