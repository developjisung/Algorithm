class Solution {
    public boolean solution(int x) {
        String[] str = Integer.toString(x).split("");
        int result = 0;
        
        for(int i = 0; i  <str.length; i++){
            result =  result + Integer.parseInt(str[i]);
        }
        
        if(x % result == 0){
            return true;
        } {
            return false;
        }
    }
}