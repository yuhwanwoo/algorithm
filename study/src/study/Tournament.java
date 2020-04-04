package study;
// https://programmers.co.kr/learn/courses/30/lessons/12985
// 프로그래머스 예상 대진표 12985
public class Tournament {

	public static void main(String[] args) {
		
		System.out.println(solution(8, 4, 7));
		solution(8, 4, 7);
	}
	static int answer=0;
	public static int solution(int n, int a, int b) {
		
		
		if(a==b) {
			return answer;
		}else {
			answer++;
			solution(n,(a+1)/2,(b+1)/2);
		}
		return answer;
	}
}
