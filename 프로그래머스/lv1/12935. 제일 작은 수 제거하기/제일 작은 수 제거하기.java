import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
       int[] result = new int[arr.length - 1];
        int[] temp = arr.clone();
        int count = 0;

        Arrays.sort(temp);
        int min_value = temp[0];

        for(int i = 0; i< arr.length; i++){
            if(arr[i] != min_value){
                result[count] = arr[i];
                count = count + 1;
            }
        }
        
        if(result.length == 0){
            int[] zero_result = {-1};

            return zero_result;
        }else{
            return result;
        }
    }
}