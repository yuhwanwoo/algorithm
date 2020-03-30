package study;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class test01 {

	public static void main(String[] args) {
		/* int[] A= {3,8,2,3,3,2}; */
		int[] A = { 3, 1, 4, 1, 5 };
		solution(A);
	}

	public static int solution(int[] A) {
		HashMap<Integer, Integer> ha = new HashMap<>();
		ArrayList<Integer> lis = new ArrayList<>();
		for (int i = 0; i < A.length; i++) {
			ha.put(A[i], 0);
		}
		for (int i = 0; i < A.length; i++) {
			ha.put(A[i], ha.get(A[i]) + 1);

		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] == ha.get(A[i])) {

				lis.add(A[i]);
			}
		}

		
		if (lis.isEmpty()) {
			return 0;
		} else {
			Collections.sort(lis);
			return lis.get(lis.size() - 1);
		}
	}

}
