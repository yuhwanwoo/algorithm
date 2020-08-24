package programmers_lev02;

import java.util.LinkedList;
import java.util.Queue;

// https://programmers.co.kr/learn/courses/30/lessons/42583
// 프로그래머스  42583 다리를 지나는 트럭

public class BridgeTruck {

	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 100;
		int[] truck_weights = { 7, 4, 1, 5, 6 };

		solution(bridge_length, weight, truck_weights);
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		int sum = truck_weights[0];
		Queue<Integer> que = new LinkedList<Integer>();

		for (int i = 0; i < truck_weights.length; i++) {
			sum = sum + truck_weights[i];
			if (sum <= weight) {
				que.add(truck_weights[i]);
			} else {
				que.poll();
			}
			que.add(truck_weights[i]);
		}

		for (int i = 0; i < que.size(); i++) {

		}

		System.out.println(answer);

		return answer;
	}
}
