package booCam;

import java.util.ArrayList;

public class Exam02 {

	public static void main(String[] args) {
		int[] arrayA= {1,2,3,2};
		int[] arrayB= {1,3};
		
		solution(arrayA, arrayB);
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static int[] solution(int[] arrayA,int[] arrayB) {
		int[] answer= {};
		ArrayList<Integer> arrA=new ArrayList<>();
		ArrayList<Integer> arrB=new ArrayList<>();
		
		//������
		ArrayList<Integer> arrS=new ArrayList<>();
		
		//������
		ArrayList<Integer> arrC=new ArrayList<>();
		
		//������
		ArrayList<Integer> arrI=new ArrayList<>();
		
		
		for(int data:arrayA) {
			if(!arrA.contains(data)) {
				arrA.add(data);
			}
		}
		
		for(int data:arrayB) {
			if(!arrB.contains(data)) {
				arrB.add(data);
			}
		}
		
		System.out.println("A����");
		for(int i=0;i<arrA.size();i++) {
			System.out.println(arrA.get(i));
		}
		
		System.out.println("B����");
		for(int i=0;i<arrB.size();i++) {
			System.out.println(arrB.get(i));
		}
		
		//������
		arrI.addAll(arrA);
		arrI.retainAll(arrB);
		
		
		
		System.out.println("������");
		for(int i=0;i<arrI.size();i++) {
			System.out.println(arrI.get(i));
		}
		
		//������
		arrC.addAll(arrA);
		arrC.removeAll(arrB);
		
		System.out.println("������");
		for(int i=0;i<arrC.size();i++) {
			System.out.println(arrC.get(i));
		}
		
		//������
		arrS.addAll(arrC);
		arrS.addAll(arrB);
		
		System.out.println("������");
		for(int i=0;i<arrS.size();i++) {
			System.out.println(arrS.get(i));
		}
		
		answer=new int[5];
		answer[0]=arrA.size();
		answer[1]=arrB.size();
		answer[2]=arrS.size();
		answer[3]=arrC.size();
		answer[4]=arrI.size();
		
		return answer;
	}

}