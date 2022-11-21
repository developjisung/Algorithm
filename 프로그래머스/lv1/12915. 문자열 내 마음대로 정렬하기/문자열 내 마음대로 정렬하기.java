import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
         String[] temp = {};
        String[][] str = new String[strings.length][2];
        String[] result = new String[strings.length];

        for(int i = 0; i<strings.length; i++){
            str[i][0] = String.valueOf(strings[i].charAt(n));
            str[i][1] = strings[i];
        }

        for(int i = 0; i <str.length; i++){
            System.out.printf("%s %s\n",str[i][0], str[i][1]);
        }

        Arrays.sort(str, (o1, o2) -> {

            if(o1[0].equals(o2[0])) {

                if(!o1[1].equals(o2[1])){
                    return o1[1].compareTo(o2[1]);
                }else{
                    return o1[0].compareTo(o2[0]);
                }

            }
            else{
                return o1[0].compareTo(o2[0]);
            }

        });

        for(int i = 0; i <str.length; i++){
            System.out.printf("%s %s\n",str[i][0], str[i][1]);
        }

        for(int i = 0; i < strings.length; i++){
            result[i] = str[i][1];
        }

        for(int i = 0; i < strings.length; i ++){
            System.out.println(result[i]);
        }

        return result;
    }
}