package study;

import java.util.ArrayList;
import java.util.Collections;

public class test02 {

	public static void main(String[] args) {
		int[] s= {51,71,17,42};
		System.out.println(solution(s));
	}

	public static int solution(int[] A) {

		ArrayList<Integer> ans=new ArrayList<>();
		ArrayList<Integer> sum=new ArrayList<>();
		for(int i=0;i<A.length;i++) {
			ans.add(A[i]/10+A[i]%10);
		}
		for(int i=0;i<ans.size();i++) {
			for(int j=0;j<ans.size();j++) {
				if(i!=j) {
					if(ans.get(i)==ans.get(j)) {
						sum.add(A[i]+A[j]);
					}else {
						break;
					}
				}
				
			}
		}
		Collections.sort(sum);
		if(sum.isEmpty()) {
			return -1;
		}else {
			return sum.get(sum.size()-1);
		}
		
	}
}
