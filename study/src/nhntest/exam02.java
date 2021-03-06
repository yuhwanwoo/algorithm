package nhntest;

import java.util.Scanner;

public class exam02 {
	private static void solution(int day, int width, int[][] blocks) {
		int[] cem = new int[width];
		int answer = 0;

		for (int i = 0; i < blocks.length; i++) {
			for (int j = 0; j < blocks[i].length; j++) {
				cem[j] += blocks[i][j];
			}
			int[] temp = new int[cem.length];

			for (int j = 0; j < temp.length; j++) {
				temp[j] = cem[j];
			}

			cem = pour(cem);

			for (int k = 0; k < cem.length; k++) {
			
				answer += (cem[k] - temp[k]);
			}
			
		}
		System.out.println(answer);
	}

	private static int[] pour(int[] cem) {
		for (int i = 0; i < cem.length; i++) {
			for (int j = i + 1; j < cem.length; j++) {

				if (cem[i] <= cem[j] && cem[i] > 0 && cem[j] > 0) {
					for (int k = i; k < j; k++) {
						if (cem[k] < cem[i]) {
							cem[k] = cem[i];
						}
					}
					
				} else if (cem[i] > cem[j] && cem[i] > 0 && cem[j] > 0) {
					for (int k = i + 1; k < j; k++) {
						if (cem[k] < cem[j]) {
							cem[k] = cem[j];
						}
					}
					continue;
				}
			}
		}
		return cem;
	}

	private static class InputData {
		int day;
		int width;
		int[][] blocks;
	}

	private static InputData processStdin() {
		InputData inputData = new InputData();

		try (Scanner scanner = new Scanner(System.in)) {
			inputData.day = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
			inputData.width = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

			inputData.blocks = new int[inputData.day][inputData.width];
			for (int i = 0; i < inputData.day; i++) {
				String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
				for (int j = 0; j < inputData.width; j++) {
					inputData.blocks[i][j] = Integer.parseInt(buf[j]);
				}
			}
		} catch (Exception e) {
			throw e;
		}

		return inputData;
	}

	public static void main(String[] args) throws Exception {
		InputData inputData = processStdin();

		solution(inputData.day, inputData.width, inputData.blocks);
	}
}
