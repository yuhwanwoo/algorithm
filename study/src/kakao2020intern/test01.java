package kakao2020intern;

import java.util.Queue;

public class test01 {

	public static void main(String[] args) {
		int[] numbers={1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand="right";
		
		solution(numbers, hand);
		System.out.println(solution(numbers, hand));
	}

	public static String solution(int[] numbers,String hand) {
		
		
		String answer="";
		lefthand lh=new lefthand("*");
		righthand rh=new righthand("#");
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==1|numbers[i]==4|numbers[i]==7||(numbers[i]+"").equals("*")) {
				lh.x=numbers[i]+"";
				answer=answer+"L";
			}else if(numbers[i]==3|numbers[i]==6|numbers[i]==9||(numbers[i]+"").equals("#")) {
				rh.x=numbers[i]+"";
				answer=answer+"R";
			}else if(hand.equals("left")&&((pandan(numbers[i], lh.x)==pandan(numbers[i], rh.x)))) {
				lh.x=numbers[i]+"";
				answer=answer+"L";
			}else if(hand.equals("right")&&((pandan(numbers[i], lh.x)==pandan(numbers[i], rh.x)))) {
				rh.x=numbers[i]+"";
				answer=answer+"R";
			}else if(pandan(numbers[i], lh.x)>pandan(numbers[i], rh.x)){
				rh.x=numbers[i]+"";
				answer=answer+"R";
			}else if(pandan(numbers[i], lh.x)<pandan(numbers[i], rh.x)){
				lh.x=numbers[i]+"";
				answer=answer+"L";
			}
		}
		
		return answer;
	}
	public static int pandan(int stand,String h) {
		if(stand==2) {
			if(h.equals("1")||h.equals("3")) {
				return 1;
			}else if(h.equals("4")||h.equals("6")) {
				return 2;
			}else if(h.equals("7")||h.equals("9")) {
				return 4;
			}else if(h.equals("*")||h.equals("#")) {
				return 6;
			}else if(h.equals("2")) {
				return 0;
			}else if(h.equals("5")) {
				return 1;
			}else if(h.equals("8")) {
				return 3;
			}else if(h.equals("0")) {
				return 5;
			}
		}else if(stand==5) {
			if(h.equals("1")||h.equals("3")) {
				return 2;
			}else if(h.equals("4")||h.equals("6")) {
				return 1;
			}else if(h.equals("7")||h.equals("9")) {
				return 2;
			}else if(h.equals("*")||h.equals("#")) {
				return 4;
			}else if(h.equals("2")) {
				return 1;
			}else if(h.equals("5")) {
				return 0;
			}else if(h.equals("8")) {
				return 1;
			}else if(h.equals("0")) {
				return 3;
			}
		}else if(stand==8) {
			if(h.equals("1")||h.equals("3")) {
				return 4;
			}else if(h.equals("4")||h.equals("6")) {
				return 2;
			}else if(h.equals("7")||h.equals("9")) {
				return 1;
			}else if(h.equals("*")||h.equals("#")) {
				return 2;
			}else if(h.equals("2")) {
				return 3;
			}else if(h.equals("5")) {
				return 1;
			}else if(h.equals("8")) {
				return 0;
			}else if(h.equals("0")) {
				return 1;
			}
		}else if(stand==0) {
			if(h.equals("1")||h.equals("3")) {
				return 6;
			}else if(h.equals("4")||h.equals("6")) {
				return 4;
			}else if(h.equals("7")||h.equals("9")) {
				return 2;
			}else if(h.equals("*")||h.equals("#")) {
				return 1;
			}else if(h.equals("2")) {
				return 5;
			}else if(h.equals("5")) {
				return 3;
			}else if(h.equals("8")) {
				return 1;
			}else if(h.equals("0")) {
				return 0;
			}
		}
				
		return 100;
	}
}

class lefthand{
	String x;
	lefthand(String x){
		this.x=x;
	}
}
class righthand{
	String x;
	righthand(String x){
		this.x=x;
	}
}