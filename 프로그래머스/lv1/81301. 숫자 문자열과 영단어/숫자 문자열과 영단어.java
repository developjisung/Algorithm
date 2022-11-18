import java.util.*;

class Solution {
    public int solution(String s) {
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] str_num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int str_length = s.split("").length;
        String temp = "";
        ArrayList<String> result = new ArrayList<>();
        String real_result = "";

        for (int i = 0; i < str_length; i++) {
            temp = temp + s.charAt(i);

            for (int j = 0; j < str.length; j++) {
                if (temp.equals(str[j])) {
                    result.add(str_num[j]);
                    temp = "";
                    break;
                }

                if(temp.equals(str_num[j])){
                    result.add(temp);
                    temp = "";
                    break;
                }
            }
        }


        for(int i = 0; i< result.size(); i++){
            real_result = real_result + result.get(i);
        }
        return Integer.parseInt(real_result);
    }
}