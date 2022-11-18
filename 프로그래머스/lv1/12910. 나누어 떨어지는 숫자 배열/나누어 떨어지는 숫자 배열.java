import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] arr, int divisor) {
       List<Integer> result = new ArrayList<>();


        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                result.add(arr[i]);

            }
        }
        
        if(result.size() == 0){
            result.add(-1);
        }
        result.sort(Comparator.naturalOrder());
        
        int[] f = new int[result.size()];
        for(int i = 0; i< result.size(); i++){
            f[i] = result.get(i);
        }

        return f;
    }
}