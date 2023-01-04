package codingtest;

public class Mod {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int answer = solution.solution(10,3);
        System.out.println(answer);     //프로그래머스 나머지 문제

    }


    static class Solution {
        public int solution(int num1, int num2) {
            int answer = -1;
            answer = num1 % num2;
            return answer;
        }
    }


}
