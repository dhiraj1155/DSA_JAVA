import java.util.HashSet;

public class removeDuplicates_4 {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,4,5,5};
        int k = remove(arr);
        System.out.println("array after removing duplicates");
        for(int i = 0; i<k; i++){
            System.out.println(arr[i]);
        }
        
    }

    // brute force
    // static int remove(int arr[]){
    //     HashSet <Integer> set = new HashSet<>();

    //     for(int i = 0; i<arr.length; i++){
    //         set.add(arr[i]);
    //     }

    //     int k = set.size();

    //     int j = 0;
    //     for(int x : set){
    //         arr[j++] = x;
    //     }
    //     return k;
    // }

    // optimal
    static int remove(int arr[]){
        int i = 0;
        for(int j = 1; j<arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    
}
