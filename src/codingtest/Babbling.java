package codingtest;

public class Babbling {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] babbling={"aya", "yee", "u", "maa", "wyeoo"};
        solution.solution(babbling);
        System.out.println(solution.solution(babbling));

    }


    static class Solution {
        public int solution(String[] babbling) {
            int answer = 0;
            for (int i = 0; i < babbling.length; i++) {
                if (babbling[i].contains("aya") || babbling[i].contains("ye") || babbling[i].contains("woo") || babbling[i].contains("ma"))
                {
                    answer = answer+1;
                }
            }
            return answer;
        }
    }

}
