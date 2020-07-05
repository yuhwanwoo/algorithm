package booCam;

import java.util.HashMap;

public class Exam01 {

	public static void main(String[] args) {
		String[] name_list = { "¿©¿ï", "º½º½" };

		solution(name_list);
	}

	public static boolean solution(String[] name_list) {
		boolean answer = false;
		
		for(int i=0;i<name_list.length;i++) {
			for(int j=0;j<name_list.length;j++) {
				if(i!=j) {
					String[] spl=name_list[j].split("");
					String temp="";
					for(int k=0;k<spl.length;k++) {
						temp=temp+spl[k];
						System.out.println("temp::"+temp);
						System.out.println("name_list[i]::"+name_list[i]);
						if(temp.equals(name_list[i])) {
							answer=true;
							break;
						}
					}
				}
			}
		}
		System.out.println(answer);

		return answer;
	}

}
