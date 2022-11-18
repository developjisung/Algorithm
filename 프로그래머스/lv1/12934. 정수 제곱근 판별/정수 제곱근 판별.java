class Solution {
    public long solution(long n) {
        long long_num = (long)Math.sqrt(n);
        double double_num = Math.sqrt(n) - long_num;


        if(double_num == 0){
            return (long)Math.pow(long_num + 1, 2);
        }
        else{
            return -1;
        }
    }
}