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
        String[] temp;
        String tem="";
        ArrayList<String> arr=new ArrayList<>();
        Queue<String> q = new LinkedList<String>();
        for(int i=0;i<26;i++) {
        	map.put((char)('A'+i)+"", i+1);
        }
        
        temp=msg.split("");
        for(int i=0;i<temp.length;i++) {
        	q.add(temp[i]);
        	arr.add(temp[i]);
        }
        
        while(q.size()>0) {
        	String t=q.poll();
        	if(map.get(t)!=null) {
        		tem=t+q.poll();
        		arr.add(tem);
        		System.out.println(tem);
        	}
        }
        System.out.println("=========");
        for(int i=0;i<arr.size();i++) {
        	System.out.println(arr.get(i));
        }
        System.out.println("========");
        System.out.println(map.get("KA"));
        
        
        return answer;
    }

}
