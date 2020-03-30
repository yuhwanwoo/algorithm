package study;

import java.util.Scanner;

public class failure {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		int n=sca.nextInt();
		int[][] arr=new int[n][n];
		
		int count=2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]==1) {
					arr[i][j]=count;
					if(arr[i+1][j]==1) {
						
					}
				}
			}
		}
	
	}
}
