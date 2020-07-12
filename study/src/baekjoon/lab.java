package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14502
// 백준 14502 연구소

public class lab {

	static int N;
	static int M;
	static int[][] clone;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		int[][] arr=new int[N][M];
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		clone=new int[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				clone[i][j]=arr[i][j];
			}
		}
		
		// 벽을 먼저 세워보자
		/*for(int i=0;i<N*M;i++) {
			int row=i/M;
			int col=i%M;
			
			if(arr[row][col]==0) {
				arr[row][col]=1;
				
				walladd(arr,i,1);
				arr=clone;
			}
		}*/
		for(int i=0;i<N*M;i++) {
			int row=i/M;
			int col=i%M;
			if(arr[row][col]==0) {
				for(int j=i+1;j<N*M;j++) {
					if(arr[j/M][j%M]==0) {
						
					}
				}
			}
		}
	}
	
	public static int[][] walladd(int[][] arr,int num,int count){
		int i=0;
		
		if(count==3) {
			//바이러스 퍼뜨리자
			
		}else {
			for(i=num+1;i<N*M;i++){
				int row=i/M;
				int col=i%M;
				if(arr[row][col]==0) {
					
					arr[row][col]=1;
					count++;
					walladd(arr,i,count);
				}
			}
			
		}
		return null;
	}
	
	public static int virus(int[][] arr,int min) {

		return 0;
	}
	
	

}
