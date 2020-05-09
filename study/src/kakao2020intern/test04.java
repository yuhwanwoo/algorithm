package kakao2020intern;

import java.util.ArrayList;

public class test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int solution(int[][] board) {
		int answer = 0;

		Car car = new Car(0, 0, 1);
		Car car2 = new Car(0, 0, 2);
		soon(car, board, 0);

		return answer;
	}

	public static int soon(Car car, int[][] board, int hap) {
		int price = hap;
		ArrayList<Integer> arr=new ArrayList<>();

		while (car.x != board.length - 1 && car.y != board[board.length - 1].length - 1) {

			if (car.r == 1) {
				if ((board[car.x + 1][car.y] == 1) || car.x + 1 == board.length) {
					price = price + 500;
				}
			} else if (car.r == 2) {
				if (board[car.x][car.y + 1] == 1 || car.y + 1 == board.length) {
					price = price + 500;
				}
			} else if (car.r == 3) {
				if ((board[car.x - 1][car.y] == 1) || car.x - 1 == -1) {
					price = price + 500;
				}
			} else if (car.r == 4) {
				if ((board[car.x][car.y - 1] == 1) || car.y - 1 == -1) {
					price = price + 500;
				}
			}else {
				price=price+100;
			}
		}
		return 0;
	}

}

class Car {
	int x;
	int y;
	int r;

	public Car(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;

	}

}
