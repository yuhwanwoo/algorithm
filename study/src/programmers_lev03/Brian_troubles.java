package programmers_lev03;

public class Brian_troubles {

	public static void main(String[] args) {
		String sentence="HaEaLaLaObWORLDb";
		
		solution(sentence);
	}
	
	public static String solution(String sentence) {
        String answer = "";
        String[] spl=sentence.split("");
        char[] cha=new char[spl.length];
        for(int i=0;i<spl.length;i++) {
        	cha[i]=spl[i].charAt(0);
        }
        
        for(int i=0;i<spl.length;i++) {
        	System.out.println(cha[i]);
        }
        
        if(cha[0]>=97 && cha[0]<=122) {
        	
        }
        
        return answer;
    }

}
