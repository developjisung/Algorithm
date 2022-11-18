import java.util.*;

public class Solution {
     public static ArrayList<Integer> solution(int []arr) {
        int flag = arr[0];
        ArrayList<Integer> result = new ArrayList<>();

        result.add(flag);

        for(int i = 1; i< arr.length; i++){
            if(flag != arr[i]){
                flag = arr[i];
                result.add(flag);
            }
        }

        return result;
    }
}