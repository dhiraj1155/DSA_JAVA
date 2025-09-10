class classSecondLargest{
    int SecondLargest(int arr[]){
        int large = Integer.MIN_VALUE;
        int sec_large = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > large){
                sec_large = large;
                large = arr[i];
            }

            else if(arr[i] > sec_large && arr[i] != large){
                sec_large = arr[i];
            }
        }
        return sec_large;

        
    }
}
public class secLargestEleFromArr_2 {



    public static void main(String[] args) {
        int arr[] = {1,2,33,4,5,67,8};
        classSecondLargest obj = new classSecondLargest();

        int result = obj.SecondLargest(arr);
        System.out.println("Second Largest element from an array is: "+result);
        
    }
    
}