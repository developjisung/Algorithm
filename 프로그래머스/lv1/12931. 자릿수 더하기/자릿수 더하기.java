import java.util.*;

public class Solution {
    public int solution(int n) {
        String str = Integer.toString(n);
        String[] arr = str.split("");
        int result = 0;

        for(int i = 0; i< arr.length; i++){
            result = result + Integer.parseInt(arr[i]);
        }

        return result;
    }
}