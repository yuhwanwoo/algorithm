package study;

import java.util.ArrayList;

public class test04 {

	public static void main(String[] args) {
		String C="example";
		String S="John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parke";
		
		System.out.println(solution(S,C));
	}

	public static String solution(String S,String C) {
		String B=S.toLowerCase();
		String[] D=S.split(";");
		String[] b=B.split(";");
		
		ArrayList<String> ans=new ArrayList<>();
		ArrayList<String> ans1=new ArrayList<>();
		for(int i=0;i<D.length;i++) {
			String[] c=D[i].split(" ");

			if(c.length==2) {
				ans1.add(c[0]+" "+c[1]);
			}else{
				ans1.add(c[0]+" "+c[1]);
			}
		}
		
		for(int i=0;i<b.length;i++) {
			String[] a=b[i].split(" ");

			if(a.length==2) {
				ans.add("<"+a[1]+"_"+a[0]+"@"+C+".com>;");
			}else{
				ans.add("<"+a[2]+"_"+a[0]+"@"+C+".com>;");
			}
		}
		String answer="";
		for(int i=0;i<ans.size();i++) {
			answer=ans1.get(i)+ans.get(i)+answer;
		}
		
		return answer;
	}
}
