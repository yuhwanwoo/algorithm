package study;

import java.util.Scanner;

public class Upper {

	public static void main(String[] args) {
		int i =0;
		char[] buf=new char[11];
		Scanner sca=new Scanner(System.in);
		
		while(i<11) {
			buf[i]=sca.next().charAt(0);
			i++;
		}
		
		for(i=0;i<11;i++) {
			System.out.print((char)(buf[i]-('a'-'A')));
		}
		
		
	}

}
