class Solution {
    public String solution(int a, int b) {
        String today = "";
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON","TUE", "WED"};            // 요일 이름
        int[] month = {0,31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};           // 달별 일 수
        int total = 0;

        for(int i = 0; i < a; i++){         // 달에 따른 일수 계산
            total = total + month[i];
        }
        total = total + b;                  // 달에 따른 일수 + 해당 달의 일수

        today = day[(total % 7)];           // % 연산을 통해 어떤 요일인지 계산
                                            // 0 : THU  1 : FRI  ....
        return today;
    }
}