package programmers_summercoding;



public class exam01 {

	public static void main(String[] args) {
		
		solution(2015);

		System.out.println(solution(2015));
	}

	public static int solution(int p) {
		int answer=0;
	
		for(int i=p+1;i<10000;i++) {
			String j=i+"";
			String[] spl=(j).split("");
			if(spl[0].equals(spl[1])||spl[0].equals(spl[2])||spl[0].equals(spl[3])||spl[1].equals(spl[2])||
					spl[1].equals(spl[3])||spl[2].equals(spl[3])) {
				answer=0;
			}else {
				answer=Integer.parseInt(spl[0]+spl[1]+spl[2]+spl[3]);
				break;
			}
			
		}
		
		return answer;
	}
}

/*for(int j=0;j<spl.length;j++) {
	hash.put(spl[j], hash.getOrDefault(spl[j], 0)+1);
	if(hash.get("0")>2||hash.get("1")>2||hash.get("2")>2||hash.get("3")>2||hash.get("4")>2
			||hash.get("5")>2||hash.get("6")>2||hash.get("7")>2||hash.get("8")>2||hash.get("9")>2) {
		
	}else {
		answer=Integer.parseInt(spl[0]+spl[1]+spl[2]+spl[3]);
		break;
	}
}*/
