package nhntest;

import java.util.Scanner;

public class exam03 {
	private static void solution(int numOfOrder, String[] orderArr) {
		for (int i = 0; i < orderArr.length; i++) {
			char[] spl=orderArr[i].toCharArray();
			for (int j = 0; j < spl.length; j++) {
				if (48 <= spl[j] && spl[j] <= 57) {
					
				}
			}
		}
	}

	private static class InputData {
		int numOfOrder;
		String[] orderArr;
	}

	private static InputData processStdin() {
		InputData inputData = new InputData();

		try (Scanner scanner = new Scanner(System.in)) {
			inputData.numOfOrder = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

			inputData.orderArr = new String[inputData.numOfOrder];
			for (int i = 0; i < inputData.numOfOrder; i++) {
				inputData.orderArr[i] = scanner.nextLine().replaceAll("\\s+", "");
			}
		} catch (Exception e) {
			throw e;
		}

		return inputData;
	}

	public static void main(String[] args) throws Exception {
		InputData inputData = processStdin();

		solution(inputData.numOfOrder, inputData.orderArr);
	}
}
