package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14501
// น้มุ 14501 ล๐ป็
//https://hyeooona825.tistory.com/58
public class Resignation {

	public static void main(String[] args) throws IOException {
		int yn;
		int[][] arr;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		yn = Integer.parseInt(st.nextToken());
		int[] dp=new int[yn];
		
		for (int i = 0; i < yn; i++) {
			int T=Integer.parseInt(st.nextToken());
			int P=Integer.parseInt(st.nextToken());
			
			dp[i+T]=dp[i];
		}
	}
}
