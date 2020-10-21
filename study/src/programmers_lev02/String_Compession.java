package programmers_lev02;
// ���̽� �ڵ带 �̷��� �ٲ����� Ʋ�Ⱦ�� ��
public class String_Compession {

	public static void main(String[] args) {
		String s="aabbaccc";
		
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
		int answer=0;
		int min=1001;
		
		if(s.length()>1) {
			for(int i=1;i<s.length()/2+1;i++) {
				min=Math.min(min, sol(i, s));
			}
		}else if(s.length()==1) {
			min=1;
		}else {
			min=0;
		}
		
		answer=min;
			
		
		return answer;
	}
	
	public static int sol(int size,String stri) {
		int cnt=1;
		System.out.println(size);
		String start=stri.substring(0, size);
		String ans="";
		
		for(int i=size;i<stri.length()+size;i+=size) {
			String value=stri.substring(i, i+size);
			System.out.println(value+":"+i);
			if(start.equals(value)) {
				cnt+=1;
				start=value;
			}else {
				if(cnt==1) {
					ans+=start;
					cnt=1;
					start=value;
				}else {
					ans+=cnt+start+"";
					cnt=1;
					start=value;
				}
			}
		}
		
		return ans.length();
	}

}