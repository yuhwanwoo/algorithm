package study;

import java.util.ArrayList;

public class eximb_exam02 {

	public static void main(String[] args) {
		int[] arr= {1, 1, 3, 3, 2, 2, 4, 5, 1, 1, 1, 3, 3, 3};
		
		solution(arr);
	}
	
	
	public static int solution(int[] arr) {
        int answer = 0;
        
        ArrayList<Integer> arr_temp=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            arr_temp.add(arr[i]);
        }
        while (true){
        	if(arr_temp.size()==1 && arr_temp.get(0)!=1) {
            	answer+=1;
            	break;
            }
            if(arr_temp.size()==1 && arr_temp.get(0)==1) {
            	break;
            }
        	answer+=1;
            int init_num=arr_temp.get(0);
            int cnt=1;
            ArrayList<Integer> arr_list=new ArrayList<>();
            for(int i=1;i<arr_temp.size();i++){
                if(arr_temp.get(i)==init_num){
                    cnt+=1;
                }else{
                    arr_list.add(cnt);
                    init_num=arr_temp.get(i);
                    cnt=1;
                }
                if(i==arr_temp.size()-1) {
                	arr_list.add(cnt);
                }
            }
            arr_temp=arr_list;
            if(arr_temp.size()==1 && arr_temp.get(0)!=1) {
            	answer+=1;
            	break;
            }
            if(arr_temp.size()==1 && arr_temp.get(0)==1) {
            	break;
            }
        }
        //System.out.println(answer);
        return answer;
    }
}
