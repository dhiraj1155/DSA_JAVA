import java.util.HashMap;

public class majorityElementFromArray_3 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,3,2,3,3,3,3,3,3,3};
        int major = findMajorityElement(arr);
        System.out.println("major element from the array is: "+major);
    }

    // brute
    // static int findMajorityElement(int arr[]){
    //     int n = arr.length;
    //     for(int i = 0; i<n; i++){
    //         int count = 0;
    //         for(int j = 0; j<n; j++){
    //             if(arr[i] == arr[j]){
    //                 count++;
    //             }
    //         }
    //         if(count > (n/2)){
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }
    
    // better using hashing
    // static int findMajorityElement(int arr[]){
    //     int n = arr.length;
    //     HashMap <Integer, Integer> mpp = new HashMap<>();

    //     for(int i = 0; i<n; i++){
    //         mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);
    //     }

    //     for(int key : mpp.keySet()){
    //         if(mpp.get(key) > n/2){
    //             return key;
    //         }
    //     }
    //     return -1;
    // }

    // optimal using moore voting algo
    static int findMajorityElement(int arr[]){
        int n = arr.length;

        int ele = 0;
        int count = 0;

        for(int i = 0; i<n; i++){
            if(count == 0){
                count = 1;
                ele = arr[i];
            }
            else if(arr[i] == ele) count++;
            else count --;

        }
        int count1 = 0;

        for(int i = 0; i<n; i++){
            if(arr[i] == ele){
                count1++;
            }
        }
        if(count1 > n/2){
            return ele;
        }
        return -1;

    }
}