package study;

import java.util.Stack;

//프로그래머스 12973

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
		st.add(an[0]);
		System.out.println(an.length);
		for(int i=1;i<an.length;i++) {
			if(st.isEmpty()) {
				st.add(an[i]);
			}else if(st.get(i).equals(st.get(i-1))){
				st.pop();
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
