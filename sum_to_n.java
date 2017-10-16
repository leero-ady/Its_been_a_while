import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sum_to_n {


    private static boolean find_sum_exists(int sum, Map<Integer,ArrayList<Integer>> hashMap,int[] input){

        int remaining_sum =0;
        for(int i=0;i<input.length;i++){
            remaining_sum = sum - input[i];
            if(hashMap.containsKey(remaining_sum))
                return true;

        }

        return false;
    }


    public static void main(String[] args){

            int [] input = {1,3,4,5,6,6};

            int sum = 100;

            Map<Integer,ArrayList<Integer>> hashMap = new HashMap<Integer, ArrayList<Integer>>();

            for(int i=0;i<input.length;i++) {
                if(!(hashMap.containsKey(input[i]))) {
                    ArrayList<Integer> a = new ArrayList<Integer>();
                    a.add(i);
                    hashMap.put(input[i], a);
                }
                else {
                    hashMap.get(input[i]).add(i);
                }

            }


            System.out.println(find_sum_exists(sum,hashMap,input));

    }



}
