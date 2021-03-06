package programmers_lev02;


// https://programmers.co.kr/learn/courses/30/lessons/12980
// 프로그래머스 12980 점프와순간이동
// 풀이봤다 https://velog.io/@hyeon930/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%A0%90%ED%94%84%EC%99%80-%EC%88%9C%EA%B0%84-%EC%9D%B4%EB%8F%99-Java
public class JumpAndTeleport {

	public static void main(String[] args) {
		int n=5;
		
		solution(n);
	}

	public static int solution(int n) {
        int ans = 0;
        
        while(n != 0){
            if(n % 2 == 0){
                n /= 2;
            } else {
                n--;
                ans++;
            }
        }

        return ans;
    }
}
