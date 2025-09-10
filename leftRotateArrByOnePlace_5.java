public class leftRotateArrByOnePlace_5 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        leftRotate(arr);
        System.out.println("after rotating array by 1 place: ");
        
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
            
        }
    }

    static void leftRotate(int arr[]){
        int temp = arr[0];
        for(int i = 1; i<arr.length; i++){
            arr[i-1] = arr[i];
            
        }
        arr[arr.length - 1] = temp;
       

    }
    
}