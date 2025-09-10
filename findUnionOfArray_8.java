import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class findUnionOfArray_8 {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,2,8,4,5};

        int union1[] = findUnion(arr1,arr2);
        
        for(int i = 0; i<union1.length; i++){
            System.out.println(union1[i]);
        }
    }

    // brute force using map
    // static int[] findUnion(int arr1[], int arr2[]){
    //     HashMap<Integer,Boolean> mpp = new HashMap<>();
    //     for(int i = 0; i<arr1.length; i++){
    //          mpp.put(arr1[i], true);
    //     }

    //     for(int i = 0; i<arr2.length; i++){
    //          mpp.put(arr2[i], true);
    //     }
    //     int result [] = new int[mpp.size()];
        
    //     int i = 0;
    //     for(int key : mpp.keySet()){
    //         result[i++] = key;
    //     }
    //     return result;
    // }

    // better using sets
    // static int[] findUnion(int arr1[], int arr2[]){
    //     HashSet<Integer> hs = new HashSet<>();
    //     for(int x : arr1){
    //         hs.add(x);
    //     }
    //     for(int y : arr2){
    //         hs.add(y);
    //     }

    //     int union[] = new int[hs.size()];
    //     int i = 0;
    //     for(int it : hs){
    //         union[i++] = it;
    //     }
    //     return union;

    // }

    
}