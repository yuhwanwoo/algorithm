package study;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class shuttleBus {

	
	public static void main(String[] args) {
		
		//String[] timetable = {"08:00","8:10","08:10"};
		String[] timetable = {"09:10","09:09","08:00"};		
		
		solution(2, 10, 2,timetable);
		
		
		
		
	}
	
	public static String solution(int n,int t,int m,String[] timetable) {
		String answer="";
		List<Integer> soonseo=new ArrayList<>();
		List<Integer> car=new ArrayList<>();
		for(int i=0;i<n;i++) {
			car.add(540+i*t);
		}
		
		for(int i=0;i<timetable.length;i++) {
			int sp;
			String[] spl=(timetable[i].split(":"));
			sp=(Integer.parseInt(spl[0])*60)+Integer.parseInt(spl[1]);
			if(sp<car.get(car.size()-1)) {
			soonseo.add(sp);
			}
		}
		
		int temp=0;
		int temre=0;
		Collections.sort(soonseo);
		if(soonseo.isEmpty()) {
			temp=(540+(n-1)*t);
			temre=mintohour(temp);
			System.out.println(rec(temre));
		}else {
			for(int i=0;i<n;i++) {
				car.add(540+i*t);
			}
			if(m*n<=soonseo.size()) {
				temp=soonseo.get((n*m)-1)-1;
				temre=mintohour(temp);
				rec(temre);
				System.out.println(rec(temre));
			}else if(m*n>soonseo.size()) {
				temp=car.get(car.size()-1);
				temre=mintohour(temp);
				rec(temre);
				System.out.println(rec(temre));
			}
		}
		
	
		
		return null;
	}
	
	public static int mintohour(int temp) {
		int hour=temp/60*100+temp%60;
		return hour;
	}
	
	public static String rec(int pretime) {
		String result="";
		if(pretime<1000 & pretime>=100) {
			result="0"+Integer.toString(pretime);
			
			result=result.substring(0, 2)+":"+result.substring(2, result.length());
			return result;
		}else if(pretime<100 & pretime>=10) {
			result="00"+Integer.toString(pretime);
			
			result=result.substring(0, 2)+":"+result.substring(2, result.length());
			return result;
		}else if(pretime<10 & pretime>=0) {
			result="000"+Integer.toString(pretime);
			
			result=result.substring(0, 2)+":"+result.substring(2, result.length());
			return result;
		}else {
			result=Integer.toString(pretime);
			result=result.substring(0, 2)+":"+result.substring(2, result.length());
			return result;
		}
	}
}
