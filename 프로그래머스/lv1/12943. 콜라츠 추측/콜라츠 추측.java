class Solution {
    public int solution(int num) {
        int count = 0;
        if(num == 1){
            return 0;
        }
        
        while(num != 1){
            if(count == 500){
                return -1;
            }
            
            if(num <0){
                return -1;
            }
            
            if(num % 2 == 0){
                num = num / 2;
                count = count + 1;
            }
            else{
                num = num * 3 + 1;
                count = count + 1;
            }
        }
        System.out.println(num);
        return count;
    }
}