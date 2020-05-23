package midas_codingTest;

public class Exam02 {

	public static void main(String[] args) {
		
		int[][] target = {{0,1},{-1,1},{1,0},{-2,2}};
		int answer;
		answer=solution(-1, 2, 2, 60, target);
		
		System.out.println(answer);

	}
	
	public static int solution(int x,int y,int r, int d, int[][] target) {
		int answer=-1;
		double tan=Math.toDegrees(Math.atan((double)y/x));
		tan=tan+180;
		double fir=tan-d;
		double fin=tan+d;
		int count=0;
		
		for(int i=0;i<target.length;i++) {
			int tx=target[i][0];
			int ty=target[i][1];
			
			double gak=Math.toDegrees(Math.atan((double)ty/tx));
			if(Math.toDegrees(Math.atan((double)ty/tx))<0) {
				gak=gak+180;
			}
			if(Math.pow(tx, 2)+Math.pow(tx, 2)<=Math.pow(r, 2)&&
					gak>=fir
					&&gak<=fin) {
				System.out.println(tx);
				System.out.println(ty);
				count++;
			}
			
		}
	
		answer=count;
		
		return answer;
	}

}
