import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int[] low_num = new int[sizes.length];
        int[] high_num = new int[sizes.length];
        
        for(int i = 0; i< sizes.length; i++){
            Arrays.sort(sizes[i]);
            low_num[i] = sizes[i][0];
            high_num[i] = sizes[i][1];
            
            System.out.println(low_num[i]);
            System.out.println(high_num[i]);
        }
        
        Arrays.sort(low_num);
        Arrays.sort(high_num);
        
        return low_num[low_num.length-1] * high_num[high_num.length-1];
        
        
        
        
    }
}