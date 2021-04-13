package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baek1799 {
	static int N, M;
	static int[][] map;
	static int[] isused01;
	static int[] isused02;
	static int leng;
	static int cnt;
	static ArrayList<Pair> pair;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        
        pair=new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==1)
                	pair.add(new Pair(i, j));
            }
        }
        isused01=new int[N*2-1];
        isused02=new int[N*2-1];
        
        leng=pair.size();
//        for (int i = 0; i < pair.size(); i++) {
//			System.out.println(pair.get(i).first()+" "+pair.get(i).second());
//		}
        
        solution(0, 0);
        System.out.println(cnt);
	}
	
	public static void solution(int index,int count) {
		if(index==leng) {
			cnt=Math.max(cnt, count);
			return;
		}
		int x=pair.get(index).first();
		int y=pair.get(index).second();
		if (isused01[x+y]==1 || isused02[x-y+N-1]==1) {
			solution(index+1, count);
		}else {
			isused01[x+y]=1;
			isused02[x-y+N-1]=1;
			solution(index+1,count+1);
			isused01[x+y]=0;
			isused02[x-y+N-1]=0;
			solution(index+1,count);
		}
		
	}

}

class Pair{
	Integer y;
	Integer x;
	public Pair(Integer y, Integer x) {
		this.y = y;
		this.x = x;
	}
	public Integer first() {
		return y;
	}
	public Integer second() {
		return x;
	}
	
}
