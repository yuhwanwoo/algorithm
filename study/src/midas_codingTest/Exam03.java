package midas_codingTest;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exam03 {

	public static void main(String[] args) {
		int[][] board= {{1,1,3,3},{4,1,3,4},{1,2,1,1},{2,1,3,2}};
		
		solution(board);

	}
	
	public static int solution(int[][] board) {
		int answer=0;
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length-1;j++) {
				if(board[i][j]==board[i+1][j]) {
					
				}
			}
		}
		
		
		
		
		
		return answer;
	}

}
