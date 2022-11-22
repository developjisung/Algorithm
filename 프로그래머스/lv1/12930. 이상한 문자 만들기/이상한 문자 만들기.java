import java.util.*;

class Solution {
    public static String solution(String s){
        String answer = "";
        s = s.toLowerCase();
        String[] Real = s.split("");
        System.out.println(Arrays.toString(Real));
        int start = -1;

        for(int i = 0; i<Real.length; i++){
            if(!Real[i].equals(" ")){
                start = start + 1;

                if(start % 2 == 0){
                    Real[i] = Real[i].toUpperCase();
                }
            }else{
                start = -1;
            }
        }

        for(int i = 0; i< Real.length; i++){
            answer = answer + Real[i];
        }

        return answer;
    }
}