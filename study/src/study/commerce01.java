package study;

import java.util.HashMap;
import java.util.Map.Entry;

public class commerce01 {

	public static void main(String[] args) {
		int[] gift_cards= {5,4,5,4,5};
		int[] wants= {1,2,3,5,4};
		
		System.out.println(solution(gift_cards,wants));
		
	}
	public static int solution(int[] gift_cards, int[] wants) {
		int answer=0;
		HashMap<Integer, Integer> hash_cards=new HashMap<>();
		HashMap<Integer, Integer> want=new HashMap<>();
		
		for (int i = 0; i < gift_cards.length; i++) {
			hash_cards.put(gift_cards[i], hash_cards.getOrDefault(gift_cards[i], 0)+1);
		}
		for (int i = 0; i < wants.length; i++) {
			want.put(wants[i], want.getOrDefault(wants[i], 0)+1);
		}
		
		for(Entry<Integer, Integer> ele : want.entrySet()) {
			int com=ele.getValue()-hash_cards.getOrDefault(ele.getKey(), 0);
			if(com>0) {
				answer+=1;
			}
		}
		
		return answer;
	}

}
