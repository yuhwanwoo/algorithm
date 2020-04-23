package programmers_lev02;

import java.util.Stack;
//https://programmers.co.kr/learn/courses/30/lessons/12973
//프로그래머스 12973 짝지어 제거하기

public class pair_remove {
	public static void main(String[] args) {

		String s="baabaa";
		solution(s);
	}
	public static int solution(String s) {
		int answer=0;
		String[] an;
		
		Stack<String> st=new Stack<>();
		an=s.split("");
		for(int i=0;i<an.length;i++) {
			
			if(st.empty()) {
				st.add(an[i]);
			}else if(st.peek().equals(an[i])) {
				st.pop();
				
			}
		}
		if(st.isEmpty()) {
			answer= 1;
		}else {
			answer= 0;
		}
		
		return answer;
	}
	
}
