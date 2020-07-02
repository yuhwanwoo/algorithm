package programmers_lev02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

// https://programmers.co.kr/learn/courses/30/lessons/17684
// 프로그래머스 17684 [3차]압축
public class Compression {

	public static void main(String[] args) {
		String msg="KAKAO";
		
		solution(msg);
	}
	
	public static int[] solution(String msg) {
        int[] answer = {};
        HashMap<String, Integer> map=new HashMap<>();

        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<26;i++) {
        	map.put((char)('A'+i)+"", i+1);
        }
        
        String[] msgspl=msg.split("");
        for(int i=0;i<msgspl.length;i++) {
            String temp=msgspl[i];
            int print=0;
            while(map.containsKey(temp)) {
            	print=map.get(temp);
            }
        }
        
        
        
        return answer;
    }

}
