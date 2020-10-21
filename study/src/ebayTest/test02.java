package ebayTest;

public class test02 {
	
	static int an=10000;
	
	public static void main(String[] args) {
		int num=18;
		int[] cards= {1,2,5};
		
		solution(num, cards);
	}
	
	public static int solution(int num, int[] cards) {
		int answer=0;
		
		for(int i=cards.length-1;i>=0;i--) {
			
			if(num%cards[i]==0) {
				an=Math.min(an, num/cards[i]);
			}else {
				rot(num%cards[i],cards,num/cards[i]);
			}
		}
		answer=an;
		System.out.println(answer);
		return answer;
	}
	
	public static int rot(int num, int[] cards, int cnt) {
		
		if(num==0) {
			an=Math.min(an, cnt);
			return cnt;
		}else {
			
			for(int i=cards.length-1;i>=0;i--) {
				if(num%cards[i]==0) {
					cnt=cnt+(num/cards[i]);
				
					rot(num%cards[i],cards,cnt);
				}else {
					if(num/cards[i]==0) {
						
					}else {
					cnt=cnt+(num/cards[i]);
						
					rot(num%cards[i],cards,cnt);
					}
				}
			}
		}
		return -1;
	}
}
