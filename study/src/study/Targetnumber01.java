package study;
//민수가 풀어준거 
// https://programmers.co.kr/learn/courses/30/lessons/43165?language=java
// 프로그래머스 타겟넘버 43165
public class Targetnumber01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Solution {

	    public int dfs(int total, int inx, int[] numbers, int answer, int target) {

	        if (inx == numbers.length) {
	            if (total == target) {

	                answer++;
	            }
	            return answer;
	        }

	        answer = dfs(total + numbers[inx], inx+1, numbers, answer, target);
	        answer = dfs(total - numbers[inx], inx+1, numbers, answer, target);

	        return answer; 
	    }
	    
	    public int solution(int[] numbers, int target) {
	        int answer = 0;
	        answer = dfs( 0, 0, numbers, answer, target);
	        return answer;
	    }
	}

}
