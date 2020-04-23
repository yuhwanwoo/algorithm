package study;

public class Line01 {

	public static void main(String[] args) {

		
		solution("([)]");
	}
	public static int solution(String inputString) {
        int answer = -1;
        int count=0;
        String[] cnt=inputString.split("");
        for(int i=0;i<cnt.length;i++) {
        	if(cnt[i].equals("(")) {
        		count++;
        		for(int j=i+1;j<cnt.length;j++) {
        			if(cnt[j].equals(")")) {
        				count++;
        				cnt[i]="0";
        				cnt[j]="0";
        				break;
        			}
        		}
        	}	
        }
        for(int i=0;i<cnt.length;i++) {
        	if(cnt[i].equals("{")) {
        		count++;
        		for(int j=i+1;j<cnt.length;j++) {
        			if(cnt[j].equals("}")) {
        				count++;
        				cnt[i]="0";
        				cnt[j]="0";
        				break;
        			}
        		}
        	}	
        }
        for(int i=0;i<cnt.length;i++) {
        	if(cnt[i].equals("[")) {
        		count++;
        		for(int j=i+1;j<cnt.length;j++) {
        			if(cnt[j].equals("]")) {
        				count++;
        				cnt[i]="0";
        				cnt[j]="0";
        				break;
        			}
        		}
        	}	
        }
        for(int i=0;i<cnt.length;i++) {
        	if(cnt[i].equals("<")) {
        		count++;
        		for(int j=i+1;j<cnt.length;j++) {
        			if(cnt[j].equals(">")) {
        				count++;
        				cnt[i]="0";
        				cnt[j]="0";
        				break;
        			}
        		}
        	}	
        }
        if(count!=0 && count%2==0) {
        	return answer=count/2;
        }else if(count!=0 && count%2==1) {
        	return answer;
        }else {
        	return 0;
        }
    }
}
