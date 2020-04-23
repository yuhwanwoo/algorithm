package study;

import java.util.ArrayList;
import java.util.Collections;

public class Line03 {

	public static void main(String[] args) {

		solution("111011110011111011111100011111", 3);
	}

	public static int solution(String road, int n) {
		int answer = -1;
		String[] spl = road.split("");
		ArrayList<Integer> zer = new ArrayList<>();
		ArrayList<Integer> len = new ArrayList<>();
		for (int i = 0; i < spl.length; i++) {
			if (spl[i].equals("0")) {
				zer.add(i);
			}
		}
		for (int i = 0; i < zer.size(); i++) {
			System.out.println(zer.get(i));
		}
		if (spl.length - 1 <= n) {
			answer = spl.length;
		} else {
			for (int j = n; j < zer.size(); j++) {
				if (j == n) {
					len.add(zer.get(n));
				} else if (j == (zer.size() - 1)) {

					len.add(spl.length - zer.get(zer.size() - 1 - n));
				} else {
					len.add(zer.get(j) - zer.get(j - n - 1) - 1);
				}
			}
			System.out.println("======================");
			for (int i = 0; i < len.size(); i++) {
				System.out.println(len.get(i));
			}
			Collections.sort(len);
			answer=len.get(len.size()-1);
		}
		return answer;
	}
}
