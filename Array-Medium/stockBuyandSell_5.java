public class stockBuyandSell_5 {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int res = findProfit(arr);
        System.out.println("max profit is: "+res);
        
    }

    // brute
    // static int findProfit(int arr[]){
    //     int n = arr.length;
    //     int maxProfit = 0;
    //     for(int i = 0; i<n; i++){
    //         for(int j = i+1; j<n; j++){
    //             if(arr[j] > arr[i]){
    //                 maxProfit = Math.max(maxProfit, arr[j] - arr[i]);
    //             }
    //         }
    //     }
    //     return maxProfit;
    // }

    // optimal
    static int findProfit(int arr[]){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        int n = arr.length;

        for(int i = 0; i<n; i++){
            minPrice = Math.min(minPrice,arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
        }
        return maxProfit;
    }
    
}