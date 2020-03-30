package study;

import java.util.Stack;

public class catchdoll {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		solution(board, moves);
	}

	public static int solution(int[][] board, int[] moves) {
       int result = 0;
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<moves.length;i++) {
			for(int j=0;j<board.length;j++)
				if(board[j][moves[i]-1]!=0) {
					st.add(board[j][moves[i]-1]);
					board[j][moves[i]-1]=0;  //넣지말고 넣기전에 팝을 해보자!
					break;
				}
			result += removedoll(st);
		}
		System.out.println(result);
		return result;
    }
	public static int removedoll(Stack<Integer> st) {
		int count = 0;
		for(int i=1;i<st.size();i++) {
			if(st.get(i)==st.get(i-1)) {
				st.pop();
				st.pop();
				count += 2;

			}
		}
		
		return count;
	}

}
