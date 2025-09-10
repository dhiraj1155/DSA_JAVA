import java.util.ArrayList;

public class moveZerosToEnd_7 {
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,2,3,4,5};
        moveZeros(arr);
        System.out.println("array after moving zeros to the end of the array: ");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
            
        }
    }

    // Brute force
    // static void moveZeros(int arr[]){
    //     ArrayList <Integer> temp = new ArrayList<>();

    //     for(int i = 0; i<arr.length; i++){
    //         if(arr[i] != 0){
    //             temp.add(arr[i]);
    //         }
    //     }

    //     for(int j = 0; j<temp.size(); j++){
    //         arr[j] = temp.get(j);
    //     }
    //     for(int k = temp.size(); k<arr.length; k++){
    //         arr[k] = 0;
    //     }

    // }

    // optimal
    static void moveZeros(int arr[]){
        int index = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }
        while(index < arr.length){
            arr[index++] = 0;
        }
    }

    
}