package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14502
// 백준 14502 연구소

public class lab {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int[][] arr=new int[N][M];
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		// 벽을 먼저 세워보자
		for(int i=0;i<N*M;i++) {
			int row=i/M;
			int col=i%M;
			
			if(arr[row][col]==0) {
				
			}
		}
	}
	
	public static int virus(int[][] arr,int min) {

		return 0;
	}
	
	public static int[][] walladd(int[][] arr){
		return null;
	}

}
