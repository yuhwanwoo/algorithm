package study;

public class eximb_exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int solution(String s) {
        int answer = 0;
        int[] al_cnt=new int[26];
        char[] array=s.toCharArray();
        for(int i=0;i<array.length;i++){
            int al=array[i]-'a';
            al_cnt[al]+=1;
        }
        
        for(int i=0;i<26;i++){
            if(al_cnt[i]%2==1){
                answer+=1;
            }
        }
        return answer;
    }

}
