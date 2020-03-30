package study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class openchat_answer {

	
	public static void main(String[] args) {

		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		solution(record);
	}
	
	
	
	
	public static String[] solution(String[] record) {
		HashMap<String, String> map = new HashMap<String, String>();
		List<String> list = new ArrayList();
		for (int i = 0; i < record.length; i++) {
			String[] split = record[i].split(" ");
			if (!split[0].equals("Leave")) {
				map.put(split[1], split[2]);
				System.out.println(split[1]+split[2]);
			}
		}

		for (int i = 0; i < record.length; i++) {
			String[] split = record[i].split(" ");
			if (split[0].equals("Enter")) {
				list.add(map.get(split[1]) + "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.");
			} else if (split[0].equals("Leave")) {
				list.add(map.get(split[1]) + "´ÔÀÌ ³ª°¬½À´Ï´Ù.");
			}
		}
		String[] answer = new String[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;

	}

}









