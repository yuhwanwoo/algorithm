package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14502
// 백준 14502 연구소

public class lab {

	static int N;
	static int M;
	static int vir;
	static int MAX;
	static Queue<Integer> que=new LinkedList<Integer>();
	
	
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
		/*clone=new int[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				clone[i][j]=arr[i][j];
			}
		}*/
		
		
		for(int i=0;i<N*M;i++) {
			if(arr[i/M][i%M]==2) {
				que.add(i);
			}
			if(arr[i/M][i%M]==0) {
				arr[i/M][i%M]=1;
				for(int j=i+1;j<N*M;j++) {
					if(arr[j/M][j%M]==0) {
						arr[j/M][j%M]=1;
						for(int k=j+1;k<N*M;k++) {
							if(arr[k/M][k%M]==0) {
								//바이러스 퍼뜨리고
								arr[k/M][k%M]=1;
								virus(arr);
								arr[k/M][k%M]=0;
							}
						}
						arr[j/M][j%M]=0;
					}
				}
				arr[i/M][i%M]=0;
			}
		}
		
	}
	
	
	public static void virus(int[][] arr) {

		
		
		
		while(!que.isEmpty()) {	
			int i=que.poll();
			SPR spr = new SPR(i/M,i%M);

			
		}
	}
	
	static class SPR{
		int x;
		int y;
		SPR(int x,int y){
			this.x=x;
			this.y=y;
		}
	}

}
