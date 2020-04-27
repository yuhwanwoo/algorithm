package baekjoon;

import java.util.Scanner;

public class Robot {
	// ���� ���⿡ ���� û������ ���� ������ �����Ѵٸ�, �� �������� ȸ���� ���� �� ĭ�� �����ϰ� 1������ �����Ѵ�.
	// ���� ���⿡ û���� ������ ���ٸ�, �� �������� ȸ���ϰ� 2������ ���ư���.
	// �� ���� ��� û�Ұ� �̹� �Ǿ��ְų� ���� ��쿡��, �ٶ󺸴� ������ ������ ä�� �� ĭ ������ �ϰ� 2������ ���ư���.
	// �� ���� ��� û�Ұ� �̹� �Ǿ� �ְų�, ���̸鼭 ���� ������ ���̶� ������ �� �� ���� ��쿡 �۵� ����
	// 0 -> 3 -> 2-> 1-> 0->3-> �̼���

	public static int cleaning(int[][] can, int x, int y, int news) {
		int room = 1;
		int[] back = { 2, 3, 0, 1 };
		can[x][y] = -1; // û��
		int pandan = 0;
		int[] third = { -1, 0, 1, 0 };
		int[] fourth = { 0, 1, 0, -1 };

		for (int i = 0; i < 4; i++) {
			int na = x + third[i];
			int nb = y + fourth[i];
			if (can[na][nb] == 0) {
				pandan++;
			}
		}
		if (pandan == 0) {
			if (can[x + third[back[news]]][y + fourth[back[news]]] == 1) {
				return room;
			} else {
				room = room + cleaning(can, x + third[back[news]], y + fourth[back[news]], news) - 1;
			}
		} else {
			if (news == 0) {
				int[] asd = { 3, 2, 1, 0 };
				for (int i = 0; i < asd.length; i++) {
					int nasd = x + third[asd[i]];
					int nbsd = y + fourth[asd[i]];
					if (can[nasd][nbsd] == 0) {
						room = room + cleaning(can, nasd, nbsd, asd[i]);
						break;
					}
				}
			} else if (news == 3) {
				int[] asd = { 2, 1, 0, 3 };
				for (int i = 0; i < asd.length; i++) {
					int nasd = x + third[asd[i]];
					int nbsd = y + fourth[asd[i]];
					if (can[nasd][nbsd] == 0) {
						room = room + cleaning(can, nasd, nbsd, asd[i]);
						break;
					}
				}
			} else if (news == 2) {
				int[] asd = { 1, 0, 3, 2 };
				for (int i = 0; i < asd.length; i++) {
					int nasd = x + third[asd[i]];
					int nbsd = y + fourth[asd[i]];
					if (can[nasd][nbsd] == 0) {
						room = room + cleaning(can, nasd, nbsd, asd[i]);
						break;
					}
				}
			} else {
				int[] asd = { 0, 3, 2, 1 };
				for (int i = 0; i < asd.length; i++) {
					int nasd = x + third[asd[i]];
					int nbsd = y + fourth[asd[i]];
					if (can[nasd][nbsd] == 0) {
						room = room + cleaning(can, nasd, nbsd, asd[i]);
						break;
					}
				}
			}
		}

		return room;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); //
		int b = scan.nextInt();

		int x = scan.nextInt(); // ��ġ ��
		int y = scan.nextInt(); // ��ġ ��

		int news = scan.nextInt(); // ����

		int can[][] = new int[a][b];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				can[i][j] = scan.nextInt();
			}
		}

		// 0 -> 3 -> 2-> 1-> 0->3-> �̼���

		int answer = cleaning(can, x, y, news);

		System.out.println(answer);

	}

}