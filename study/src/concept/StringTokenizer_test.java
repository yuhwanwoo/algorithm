package concept;

import java.util.StringTokenizer;

public class StringTokenizer_test {

	public static void main(String[] args) {
		String aaa="�ȳ�.����.����.�����.";
		StringTokenizer str=new StringTokenizer(aaa,".");
		System.out.println(str.countTokens());
		for (int i = 0; i < str.countTokens(); i++) {
			System.out.println(str.countTokens()+":next�ϱ���");
			System.out.println(str.nextToken()+"==="+i); //nextToken()�ϸ� �پ���
			System.out.println(str.countTokens()+":next�� ��");
		}
		System.out.println("=============");
		
		int cnt=str.countTokens();
		System.out.println(cnt);
		for(int i=0;i<cnt;i++) {
			String token=str.nextToken();
			System.out.println(token);
		}
		System.out.println("---------");
		String bbb="�ȳ�.����.����.�����.";
		StringTokenizer str1=new StringTokenizer(bbb,".");
		int count=str1.countTokens();
		for(int i=0;i<count;i++) {
			String token=str1.nextToken();
			System.out.println(token);
		}
		System.out.println("=================");
		String ccc="�ȳ�.����.����.�����.";
		StringTokenizer str2=new StringTokenizer(ccc,".");
		while(str2.hasMoreTokens()) {
			System.out.println(str2.nextToken());
		}
		
	}

}