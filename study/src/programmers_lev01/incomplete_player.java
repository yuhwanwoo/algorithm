package programmers_lev01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
// https://programmers.co.kr/learn/courses/30/lessons/42576
// 프로그래머스 42576 완주하지 못한 선수
public class incomplete_player {

	public static void main(String[] args) {
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		solution(participant, completion);

	}

	/*public static String solution(String[] participant, String[] completion) {
		String answer="";
		HashMap<String, Integer> hm=new HashMap<>();
		
		for(String pa:participant) {
			hm.put(pa, hm.getOrDefault(pa,0 )+1);
		}
		for(String co:completion) {
			hm.put(co, hm.getOrDefault(co, 0)-1);
			
		}
		for(String key:hm.keySet()) {
			if(hm.get(key)!=0) {
				answer=key;
			}
		}
		return answer;
	}*/
	
	/*
	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		int i;
		for(i=0;i<completion.length;i++) {
			if(!participant[i].equals(completion[i])) {
				System.out.println(participant[i]);
				return participant[i];
			}
		}
		return participant[i];
	}*/
	
	//내가 한건데 효율성에서 틀렸어
/*	public static String solution(String[] participant, String[] completion) {
		ArrayList<String> par = new ArrayList<>();

		for (int i = 0; i < participant.length; i++) {
			par.add(participant[i]);
		}

		for (int j = 0; j < completion.length; j++) {
			par.remove(completion[j]);
		}

		
		return par.get(0);
	}*/

	public static String solution(String[] participant, String[] completion) {
		LinkedList<String> par = new LinkedList<>();

		for (int i = 0; i < participant.length; i++) {
			par.add(participant[i]);
		}

		for (int j = 0; j < completion.length; j++) {
			par.remove(completion[j]);
		}

		
		return par.get(0);
	}
}
