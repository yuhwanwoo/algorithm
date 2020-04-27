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
		arr = new int[yn][2];
		for (int i = 0; i < yn; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int answer = 0;

		answer = solution(arr, 0, 0);
		System.out.println(answer);

	}

	public static int solution(int[][] arr, int yn, int cnt) {

		if (arr.length > yn) {
			return cnt;
		} else {
			
		}
		
		return 0;
	}
}
