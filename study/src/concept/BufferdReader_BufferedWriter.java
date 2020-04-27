package concept;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//https://coding-factory.tistory.com/251
//Scanner�� space�� enter��� ���� �ν�������
//BufferedReader�� Enter�� ���� �ν��ϰ� ���������Ͱ� String���� ���� but ���� ������ �������� �ξ� ȿ����

public class BufferdReader_BufferedWriter {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //����
		String s = bf.readLine(); //String
		System.out.println(s);
		int i = Integer.parseInt(bf.readLine());
		System.out.println(i);
		
		//BufferedWriter �� ��� ���۸� ��� ���ұ� ������ �ݵ�� 
		//flush() / close() �� �ݵ�� ȣ���� �־� ��ó���� ���־���մϴ�. 
		//�׸��� bw.write���� System.out.println();�� ���� �ڵ��������� 
		//���⶧���� ������ ���־���� ��쿡�� \n�� ���� ���� ó�����־���մϴ�.
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(s+"--");
		bw.flush();
		bw.close();
		
		
	}

}