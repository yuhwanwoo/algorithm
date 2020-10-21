package study;

import java.util.LinkedList;
import java.util.Queue;

public class asdf {

	public static void main(String[] args) {
		int cacheSize1 = 3;
		String[] cities1 = { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA" };
		 solution(cacheSize1, cities1);
		// (output) 50

		int cacheSize2 = 3;
		String[] cities2 = { "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul" };
		// solution(cacheSize2, cities2);
		// (output) 21

		int cacheSize3 = 2;
		String[] cities3 = { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris",
				"Jeju", "NewYork", "Rome" };
		// solution(cacheSize3, cities3);
		// (output) 60

		int cacheSize4 = 5;
		String[] cities4 = { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris",
				"Jeju", "NewYork", "Rome" };
		// solution(cacheSize4, cities4);
		// (output) 52

		int cacheSize5 = 2;
		String[] cities5 = { "Jeju", "Pangyo", "NewYork", "newyork" };
		// solution(cacheSize5, cities5);
		// (output) 16

		int cacheSize6 = 0;
		String[] cities6 = { "Jeju", "Pangyo", "Seoul", "NewYork", "LA" };
		// solution(cacheSize6, cities6);
		// (output) 25

		int cacheSize7 = 5;
		String[] cities7 = { "Jeju", "Jeju", "Jeju" };
		//solution(cacheSize7, cities7);

	}

	public static int solution(int cacheSize, String[] cities) {
		int answer = 0;
		Queue<String> q = new LinkedList<String>();
		for (int i = 0; i < cities.length; i++) {
			if (cacheSize > cities.length) {
				if (!q.contains(cities[i].toUpperCase())) {
					q.add(cities[i].toUpperCase());
					answer += 5;
				} else {
					q.remove(cities[i].toUpperCase());
					q.add(cities[i].toUpperCase());
					answer += 1;
				}
			} else {
				if (q.size() < cacheSize) {
					if (q.contains(cities[i].toUpperCase())) {
						q.remove(cities[i].toUpperCase());
						q.add(cities[i].toUpperCase());
						answer += 5;
					}else {
						q.poll();
						q.add(cities[i].toUpperCase());
					}
					
				} else {
					if (!q.contains(cities[i].toUpperCase())) {
						q.poll();
						q.add(cities[i].toUpperCase());
						answer += 5;
					} else {
						q.remove(cities[i].toUpperCase());
						q.add(cities[i].toUpperCase());
						answer += 1;
					}
				}
			}
		}
		if (cacheSize == 0) {
			answer = cities.length * 5;
		}
		System.out.println(answer);
		return answer;

	}
}
