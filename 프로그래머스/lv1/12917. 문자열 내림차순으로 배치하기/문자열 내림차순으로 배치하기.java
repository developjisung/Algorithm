import java.util.*;

class Solution {
    public String solution(String s) {
//         int str_length = s.split("").length;
//         List<Character> low_alpha = new ArrayList<>();
//         List<Character> upper_alpha = new ArrayList<>();

//         for(int i = 0; i <str_length; i++ ){
//             if(s.charAt(i) >= 65 && s.charAt(i) <97){
//                 upper_alpha.add(s.charAt(i));
//             }
//             else{
//                 low_alpha.add(s.charAt(i));
//             }
//         }

//         Collections.sort(low_alpha);
//         Collections.sort(upper_alpha);
        
//         Collections.reverse(low_alpha);
//         Collections.reverse(upper_alpha);

//         String result = "";

//         for(int i = 0; i < low_alpha.size(); i++){
//             result = result + low_alpha.get(i);
//         }

//         for(int i = 0; i <upper_alpha.size(); i++){
//             result = result + upper_alpha.get(i);
//         }

//         return result;
        int str_length = s.split("").length;
        String result = "";
        int[] temp = new int[str_length];

        for(int i = 0; i<str_length; i++){
            temp[i] = (int)s.charAt(i);
        }
        Arrays.sort(temp);

        for(int i = str_length - 1; i >=0; i--){
            result = result + (char)temp[i];
        }
        System.out.println(result);
        return result;
    }
}