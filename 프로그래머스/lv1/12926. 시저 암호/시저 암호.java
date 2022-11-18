class Solution {
    public String solution(String s, int n) {
           int str_length = s.split("").length;
        String result = "";
        for(int i = 0; i<str_length; i++){
            if(s.charAt(i) == 32){
                result = result + " ";
                continue;
            }
            if(((s.charAt(i) + n) > 90) &&(s.charAt(i) < 91 && s.charAt(i) >= 65) ){
                result = result + (char)(s.charAt(i) + n - 26);
            }
            else if(((s.charAt(i) + n) >= 123) &&(s.charAt(i) < 123 && s.charAt(i) >= 97)){
                result = result + (char)(s.charAt(i) + n - 26);
            }
            else{
                result = result + (char)(s.charAt(i) + n);
            }
        }

        return result;
    }
}