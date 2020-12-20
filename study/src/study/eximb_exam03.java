package study;

public class eximb_exam03 {

	public static void main(String[] args) {
		int n=33;
		
		System.out.println(solution(n));

	}
	
	public static int solution(int n) {
        int answer = 0;
        
        answer=n/5;
        int temp=n%5;
        if(temp%3!=0) {
        	return -1;
        }else {
        	answer+=temp/3;
        }

        return answer;
    }

}
