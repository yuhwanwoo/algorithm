package programmers_lev02;

public class WorldChainInEng {

	public static void main(String[] args) {
		int n=3;
		String[] words= {"tank","kick","know","wheel","land","dream","mother","robot","tank"};
		
		solution(n, words);
	}

	public static int[] solution(int n, String[] words) {
        int[] answer = {};
        String[] spl;
        String[] sp=words[0].split("");
        String temp=sp[sp.length-1];
        System.out.println(temp);
        
        for(int i=0;i<words.length;i++) {
        	spl=words[i].split("");
        	if(temp.equals(spl[0])) {
        		temp=spl[spl.length-1];
        		System.out.println(temp);
        	}
        	
        }
        
        return answer;
    }

}
