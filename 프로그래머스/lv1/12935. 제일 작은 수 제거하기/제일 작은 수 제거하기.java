import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
       int[] result = new int[arr.length - 1];     // 최솟값을 제외한 나머지 값들을 저장할 결과 배열
        int[] temp = arr.clone();                   // 정렬한 후, 최솟값을 찾기 위한 배열 
        int count = 0;                              // 최솟값을 찾은 후, 나머지 값들을 result 배열에 넣기 위한 count 
        int min_value = 0;
        
        Arrays.sort(temp);                          // 오름차순 정렬                      
        min_value = temp[0];                        // 최솟값 저장

        for(int i = 0; i< arr.length; i++){         // min_value를 제외한 나머지 값 result 배열 입력
            if(arr[i] != min_value){
                result[count] = arr[i];
                count = count + 1;
            }
        }

        if(result.length == 0) {                     // result에 아무것도 없으면 -1 입력
            int[] zero_result = {-1};
            return zero_result;
        }
        
        return result;
    }
}