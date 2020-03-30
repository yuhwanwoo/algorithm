package study;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {

		Stack<Integer> st=new Stack<>();
		st.add(1);
		st.add(4);
		st.add(7);
		st.add(3);
		st.pop();
		System.out.println(st);
		System.out.println(st.get(0));
	}

}
