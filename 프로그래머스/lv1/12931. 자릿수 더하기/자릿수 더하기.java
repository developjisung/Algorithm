import java.util.*;

public class Solution {
    public int solution(int n) {
        String[] arr = Integer.toString(n).split("");       // 주어진 값을 String으로 변환 후, split
        int result = 0;

        for (String s : arr) {                       // 각 자릿수 더하기
            result = result + Integer.parseInt(s);
        }

        return result;
    }
}