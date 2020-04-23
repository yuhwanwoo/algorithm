package study;

public class dev_matching02 {

	public static void main(String[] args) {
		int[][] office= {{5,-1,4},{6,3,-1},{2,-1,1}};
		int r=0;
		int c=0;
		String[] move= {"go","go","right","go","right","go","left","go"};
		
		solution(office, r, c, move);
	}
	
	public static int solution(int[][] office,int r,int c,String[] move) {
		int answer=0;
		answer=office[r][c];
		
		for(int i=0;i<move.length;i++) {
			if(move[i].equals("go")) {
				
			}
		}
		
		return answer;
	}
	
	public static int rot(int t) {
		return 0;
	}

}
