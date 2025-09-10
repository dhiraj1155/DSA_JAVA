public class leftRotateArrByDPlaces_6 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int D = 3;
        System.out.println("array before reversing by D Places: ");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        leftRotateByD(arr,D);

        System.out.println("array after rotating by D places: ");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static void reverse(int arr[], int start, int end){
         start = 0;
         end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void leftRotateByD(int arr[], int D){
        int n = arr.length;

        reverse(arr,0, n-D-1);
        reverse(arr,n-D, n-1);
        reverse(arr,0,n-1);
    }
    
}