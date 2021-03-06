package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class nhn_test {
	public static ArrayList<Integer> leng=new ArrayList<>();
	public static int cnt=0;
	
	private static void solution(int sizeOfMatrix, int[][] matrix) {
	    int result=0;
	    
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (dfs(i, j, sizeOfMatrix, matrix)==true){
					result+=1;
					leng.add(cnt);
					cnt=0;
				}
			}
		}
		Collections.sort(leng);
		System.out.println(result);
		if(leng.size()==0) {

		}else {
			for (int i = 0; i < leng.size(); i++) {
				System.out.print(leng.get(i)+" ");
			}
		}
	  }
	
	public static boolean dfs(int x,int y,int sizeOfMatrix,int[][] matrix) {
		if(x<=-1 || x>=sizeOfMatrix || y<=-1 || y>=sizeOfMatrix) {
			return false;
		}
		if(matrix[x][y]==1) {
			matrix[x][y]=0;
			cnt+=1;
			dfs(x-1, y, sizeOfMatrix, matrix);
			dfs(x, y-1, sizeOfMatrix, matrix);
			dfs(x+1, y, sizeOfMatrix, matrix);
			dfs(x, y+1, sizeOfMatrix, matrix);
			return true;
		}
		return false;
	}
	
	
	  private static class InputData {
	    int sizeOfMatrix;
	    int[][] matrix;
	  }

	  private static InputData processStdin() {
	    InputData inputData = new InputData();

	    try (Scanner scanner = new Scanner(System.in)) {
	      inputData.sizeOfMatrix = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));      
	      
	      inputData.matrix = new int[inputData.sizeOfMatrix][inputData.sizeOfMatrix];
	      for (int i = 0; i < inputData.sizeOfMatrix; i++) {
	        String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
	        for (int j = 0; j < inputData.sizeOfMatrix; j++) {
	          inputData.matrix[i][j] = Integer.parseInt(buf[j]);
	        }
	      }
	    } catch (Exception e) {
	      throw e;
	    }
			
	    return inputData;
	  }

	  public static void main(String[] args) throws Exception {
	    InputData inputData = processStdin();

	    solution(inputData.sizeOfMatrix, inputData.matrix);
	  }
}
