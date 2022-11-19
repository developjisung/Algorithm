import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
       Arrays.sort(participant);           // participant sort
        Arrays.sort(completion);            // completion sort
        String result = "";

        for(int i = 0; i < participant.length; i++){
            if(i == completion.length){             // completion 배열의 끝까지 순회했다면
                result = participant[i];            // participant 배열의 마지막 값을 저장
                break;
            }

            if(!participant[i].equals(completion[i])){  // 두 배열의 값이 동일하지 않다면
                result =  participant[i];                       // participant 배열의 값을 저장
                break;
            }
        }

        return result;
    }
}