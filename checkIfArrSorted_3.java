import java.util.ArrayList;

public class checkIfArrSorted_3 {
    
    static boolean checkSorted(ArrayList<Integer> list){
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > list.get((i + 1) % list.size())){
                count++;
            }
        }
        if(count > 1)return false;
        else return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(9);

        boolean result = checkSorted(list);
        System.out.println(result);
        
    }
    
}