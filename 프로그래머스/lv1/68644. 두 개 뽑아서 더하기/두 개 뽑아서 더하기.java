import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        int[] flag = new int[200];
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j< numbers.length; j++){
                if((i != j) && flag[numbers[i] + numbers[j]] == 0){
                    result.add(numbers[i] + numbers[j]);
                    flag[numbers[i] + numbers[j]] = 1;
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}