package programmers_lev02;

import java.util.Stack;
// https://programmers.co.kr/learn/courses/30/lessons/42588
// 프로그래머스 탑 42588
public class tower {

	public static void main(String[] args) {
		int[] height= {1,5,3,6,7,6,5};
		
		solution(height);
	}
	
	public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Stack<Integer> st=new Stack<>();
        Stack<Integer> st1=new Stack<>();
        
        for(int i=0;i<heights.length;i++) {
        	st.push(heights[i]);
        }
        while(st.size()>0) {
        	for(int i=st.size()-1;i>=0;i--) {
        		if(st.get(st.size()-1)<st.get(i)){
        			st1.push(i+1);
        			break;
        		}
        		if(i==0) {
        			st1.push(0);
        			break;
        		}
        	}
        	
        	st.pop();
        	
        }
        
        for(int i=0;i<answer.length;i++) {
        	answer[i]=st1.pop();
        }
        
        
        return answer;
    }

}
