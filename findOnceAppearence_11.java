import java.util.HashMap;
import java.util.Map;

public class findOnceAppearence_11 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,3,4,5,5};
        int num = findOnceAppearence(arr);
        System.out.println("number that appears once is : "+num);

        
    }
    
    // static int findOnceAppearence(int arr[]){
    //     HashMap<Integer,Integer> mpp = new HashMap<>();
    //     int missing;
    //     for(int i = 0; i<arr.length; i++){
    //         int value = mpp.getOrDefault(arr[i],0);
    //         mpp.put(arr[i], value+1);
    //     }
    //     for(Map.Entry<Integer, Integer> it : mpp.entrySet()){
    //         if(it.getValue() == 1){
    //            return it.getKey();
    //         }
    //     }
    //     return -1;
    // }

    // optimal
    static int findOnceAppearence(int arr[]){
        int xorr = 0;
        for(int i = 0; i<arr.length; i++){
            xorr ^= arr[i];
        }
        return xorr;
    }
}