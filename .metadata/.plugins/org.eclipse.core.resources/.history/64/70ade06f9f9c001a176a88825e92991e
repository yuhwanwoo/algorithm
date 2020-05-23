package programmers_summercoding;

import java.util.ArrayList;
import java.util.Arrays;

public class exam02 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
        int n = arr.length;
        int r = 2;
        int[] combArr = new int[n];
        comb(combArr, n, r, 0, 0, arr);
    
	}
	
	public static long solution(long n) {
        long answer = 0;
        ArrayList<Integer> list_arr=new ArrayList<>();
        
        for(int i=0;i<=10;i++) {
        	list_arr.add((int) Math.pow(3, i));
        }
        
        /*for(int i=0;i<list_arr.size();i++) {
        	System.out.println(list_arr.get(i));
        }*/
        
         
        
        return answer;
	}
	
	public static void comb(int[] comarr,int n,int r,int index, int target, int[] arr) {
		System.out.println("=>"+n+" "+r+" "+index+" "+target);
		
		if(r==0) {
			System.out.println(Arrays.toString(comarr));
			 for(int i=0; i<index; i++)System.out.print(arr[comarr[i]] + " ");
	           
	            System.out.println();
	         
	        //끝까지 다 검사한 경우..1개를 뽑은 상태여도 실패한 경우임 무조건 return 으로 종료
	        }else if(target == n){ 
	             
	            return;
	         
	        }else{
	            comarr[index] = target;
	            // (i) 뽑는 경우 
	            // 뽑으니까, r-1
	            // 뽑았으니 다음 index + 1 해줘야 함
	            comb(comarr, n, r-1, index+1, target+1, arr);
	             
	            //(ii) 안 뽑는경우
	            // 안뽑으니까 그대로 r
	            // 안뽑았으니, index는 그대로!
	            // index를 그대로하면, 예를 들어 현재 1번 구슬을 comArr에 넣엇어도 다음 재귀에 다시 엎어쳐서 결국 1구슬을 뽑지 않게 된다.
	            comb(comarr, n, r, index, target+1, arr); 
		}
	}
	

}
