class Solution {
    public String solution(int n) {
        String result = "";
        
        for(int i = 0; i < n; i++){
            if(i%2 == 0){
                result = result + "수";
            }
            else{
                result = result + "박";
            }
        }
        
        return result;
    }
}