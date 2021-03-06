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
		
		//합집합
		ArrayList<Integer> arrS=new ArrayList<>();
		
		//차집합
		ArrayList<Integer> arrC=new ArrayList<>();
		
		//교집합
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
		
		System.out.println("A집합");
		for(int i=0;i<arrA.size();i++) {
			System.out.println(arrA.get(i));
		}
		
		System.out.println("B집합");
		for(int i=0;i<arrB.size();i++) {
			System.out.println(arrB.get(i));
		}
		
		//교집합
		arrI.addAll(arrA);
		arrI.retainAll(arrB);
		
		
		
		System.out.println("교집합");
		for(int i=0;i<arrI.size();i++) {
			System.out.println(arrI.get(i));
		}
		
		//차집합
		arrC.addAll(arrA);
		arrC.removeAll(arrB);
		
		System.out.println("차집합");
		for(int i=0;i<arrC.size();i++) {
			System.out.println(arrC.get(i));
		}
		
		//합집합
		arrS.addAll(arrC);
		arrS.addAll(arrB);
		
		System.out.println("합집합");
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
