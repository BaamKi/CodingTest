package codingtest;

public class Sequence {

    public static void main(String[] args) {
        class Solution {
            public int solution(int[] common) {
                int answer = 0;
                int length = common.length;
                int bi = common[1] - common[0];
                answer = common[length-1]+bi;
                return answer;
            }
        }
        int [] arr = {1,2,3,4,5};
        Solution solution = new Solution();
        System.out.println(solution.solution(arr));

    }



}