package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class tuple {

	public static void main(String[] args) {
	/*	String s1 = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		solution(s1);
		//(output) [2, 1, 3, 4]
*/
		String s2 = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
		solution(s2);
		//(output) [2, 1, 3, 4]
/*
		String s3 = "{{20,111},{111}}";
		solution(s3);
		//(output) [111, 20]

		String s4 = "{{123}}";
		solution(s4);
		//(output) [123]

		String s5 = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
		solution(s5);
		//(output) [3, 2, 4, 1]
*/	
		
	
}
	
	public static int[] solution(String s) {
		ArrayList<Integer> result = new ArrayList<>();
		String[] spl;
		String a=s.substring(2,s.length()-2);
		System.out.println(a);
		spl=a.split("\\},\\{");
		
		
		

		Arrays.sort(spl, new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() > s2.length()){
					return 1;
				} else if (s1.length() < s2.length()) {
					return -1;
				} else {
					return 0;		
				}
			}
		});
		return null;
	}}

