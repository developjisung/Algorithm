import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
       ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                result.add(arr[i]);
            }
        }
        
        Collections.sort(result);
        
        if(result.size() == 0){
            result.add(-1);
        }
        
        return result;
    }
}