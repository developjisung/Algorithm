class Solution {
    public String solution(int a, int b) {
        String today = "";
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON","TUE", "WED"};        // 요일 이름
        int[] month = {0,31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};         // 달별 일 수
        int total = 0;

        for(int i = 0; i < a; i++){
            total = total + month[i];
        }
        total = total + b;

        today = day[(total % 7)];
        return today;
    }
}