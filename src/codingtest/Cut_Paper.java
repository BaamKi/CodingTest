package codingtest;

public class Cut_Paper {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(5,5));

    }

    static class Solution {
        public int solution(int M, int N) {
            int answer = 0;
            answer = M*N-1;
            return answer;
        }
    }
}
