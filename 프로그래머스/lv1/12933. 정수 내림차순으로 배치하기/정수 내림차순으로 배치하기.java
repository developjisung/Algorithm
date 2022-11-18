import java.util.*;

class Solution {
    public long solution(long n) {
        String[] arr = Long.toString(n).split("");
        String temp = "";
        long result = 0;

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i< arr.length; i++){
            temp = temp + arr[i];
        }

        result = Long.parseLong(temp);

        return result;
        
    }
}