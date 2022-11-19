import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
       ArrayList<Integer> result = new ArrayList<>();      // result 담을 ArrayList 선언

        for(int i = 0; i < arr.length; i++){                // 각 배열의 원소들 divisor로 나눠지는지 확인 작업
            if(arr[i] % divisor == 0){
                result.add(arr[i]);
            }
        }
        Collections.sort(result);                           // 정렬
        if(result.size() == 0){                             // size = 0일 때, 예외 처리 
            result.add(-1);
        }
        
        return result;
    }
}