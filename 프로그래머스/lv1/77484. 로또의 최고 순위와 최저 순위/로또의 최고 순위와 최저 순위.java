class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] count = {0, 0};
        int zero_count = 0;

        for(int i = 0; i < lottos.length; i++){
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    count[0] = count[0] + 1;
                    count[1] = count[1] + 1;
                    break;
                }
            }
        }

        for(int i = 0; i<lottos.length; i++){
            if(lottos[i] == 0){
                zero_count = zero_count + 1;
            }
        }
        count[0] = count[0] + zero_count;


        count[0] = 6 - count[0] + 1;
        count[1] = 6 - count[1] + 1;


        if(count[1] > 6){
            count[1] = 6;
        }else if(count[1] <0){
            count[1] = 1;
        }

        if(count[0] < 0){
            count[0] = 1;
        }
        else if(count[0]> 6){
            count[0] = 6;
        }
        System.out.println(count[1]);
        System.out.println(count[0]);
        return count;
    }
}