public class maxConsecutiveOnes_10 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,3,1,1,1,1,1};
        int maxOnes = findMaxConsecutiveOnes(arr);
        System.out.println("maximum consecutive ones are: "+maxOnes);
    }

    static int  findMaxConsecutiveOnes(int arr[]){
        int count = 0;
        int maxCount = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
                maxCount = Math.max(maxCount,count);
            }else{
                count = 0;
            }
        }
        return maxCount;
    }
    
}