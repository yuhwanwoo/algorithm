package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://hyeooona825.tistory.com/58 �̻�� �ڵ����ϳ�
public class res {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());

            System.out.println("i:"+i);
            dp[i + 1] = Math.max(dp[i], dp[i + 1]);
            System.out.println(dp[i+1]);
            System.out.println("i+T::"+(i+T));
            if (i + T <= N) {
            	dp[i + T] = Math.max(dp[i + T], dp[i] + P);
            	System.out.println("dp[t+T]:::"+dp[i+T]);
            }
            System.out.println("===========");
          
        }
        System.out.println(dp[N]);
    }
}
