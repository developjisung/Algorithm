import java.util.ArrayList;
import java.util.Arrays;

class Solution {
      public static ArrayList<Integer> solution(int[] answers) {
        int[] number1 = {1,2,3,4,5};
        int[] number2 = {2,1,2,3,2,4,2,5};
        int[] number3 = {3,3,1,1,2,2,4,4,5,5};
        int[] temp;
        int[] count  = new int[3];
        int max_correct = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i< answers.length; i++){
            if(number1[i % 5] == answers[i]){
                count[0] = count[0] + 1;
            }

            if(number2[i % 8] == answers[i]){
                count[1] = count[1] + 1;
            }

            if(number3[i % 10] == answers[i]){
                count[2] = count[2] + 1;
            }
        }

        temp = count.clone();
        Arrays.sort(temp);

        for(int i = 0; i< temp.length; i++){
            if(max_correct < count[i]){
                max_correct = count[i];
            }
        }

        for(int i  = 0; i< count.length; i++){
            if(max_correct == count[i]){
                result.add(i+1);
            }
        }

        return result;
    }
}