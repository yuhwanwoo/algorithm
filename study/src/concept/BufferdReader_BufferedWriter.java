package concept;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//https://coding-factory.tistory.com/251
//Scanner은 space랑 enter모두 경계로 인식하지만
//BufferedReader는 Enter만 경계로 인식하고 받은데이터가 String으로 고정 but 많은 데이터 받을때는 훨씬 효율적

public class BufferdReader_BufferedWriter {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		String s = bf.readLine(); //String
		System.out.println(s);
		int i = Integer.parseInt(bf.readLine());
		System.out.println(i);
		
		//BufferedWriter 의 경우 버퍼를 잡아 놓았기 때문에 반드시 
		//flush() / close() 를 반드시 호출해 주어 뒤처리를 해주어야합니다. 
		//그리고 bw.write에는 System.out.println();과 같이 자동개행기능이 
		//없기때문에 개행을 해주어야할 경우에는 \n를 통해 따로 처리해주어야합니다.
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(s+"--");
		bw.flush();
		bw.close();
		
		
	}

}
