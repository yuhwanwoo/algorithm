package study;

import java.util.ArrayList;
import java.util.Collections;

public class park {
	 public static void main(String[] args) {
	      int sizeOfMatrix1 = 6;
	      int[][] matrix1 = {{0, 1, 1, 0, 0, 0}, {0, 1, 1, 0, 1, 1}, {0, 0, 0, 0, 1, 1}, {0, 0, 0, 0, 1, 1}, {1, 1, 0, 0, 1, 0}, {1, 1, 1, 0, 0, 0}};
	      //solution(sizeOfMatrix1, matrix1);
	      //(output) 3\n4 5 6\n
	      
	      /*int sizeOfMatrix2 = 4;
	      int[][] matrix2 = {{0, 0, 0, 0}, {0, 0 ,0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
	      solution(sizeOfMatrix2, matrix2);*/
	      int sizeOfMatrix2 = 3;
	      int[][] matrix2 = {{0, 0, 0}, {0, 0 ,0}, {0, 0, 1}};
	      solution(sizeOfMatrix2, matrix2);
	      //(output) 0\n
	   }

	   private static void solution(int sizeOfMatrix, int[][] matrix) {
	      int count = 0;   //영역 개수
	      ArrayList<Integer> sizes = new ArrayList<>();   //각 영역의 크기
	      
	      for(int i=0;i<matrix.length;i++) {
	         for(int j=0;j<matrix[i].length;j++) {
	            if(matrix[i][j] == 1) {
	               int cnt = checkSize(matrix, i, j);
	               sizes.add(cnt-1);
	            }
	            
	            /*for(int a=0;a<matrix.length;a++) {
	               for(int b=0;b<matrix.length;b++) {
	                  System.out.print(matrix[a][b] + " ");
	               }System.out.println();
	            }System.out.println();*/
	         }
	      }
	      
	      count = sizes.size();
	      Collections.sort(sizes);
	      
	      System.out.println(count);
	      if(count > 0) {
	         for(int i=0;i<sizes.size();i++) {
	            System.out.print(sizes.get(i));
	            if(i < sizes.size()-1)
	               System.out.print(" ");
	            else
	               System.out.println();
	         }
	      }
	   }
	      
	   private static int checkSize(int[][] matrix, int x, int y) {
	      int cnt = 1;
	      int dx[] = {-1, 0, 1, 0};
	      int dy[] = {0, -1, 0, 1};
	      
	      for(int i=0;i<4;i++) {
	         int nx = x + dx[i];
	         int ny = y + dy[i];
	         if(rangeCheck(nx, ny, matrix.length, matrix.length) && matrix[nx][ny] == 1) {
	            matrix[nx][ny] = 0;
	            cnt += checkSize(matrix, nx, ny);
	         }
	      }
	      
	      return cnt;
	   }
	   
	   private static boolean rangeCheck(int x, int y, int maxX, int maxY) {
	      if(x >= 0 && y >= 0 && x < maxX && y < maxY)
	         return true;
	      else
	         return false;
	   }

}
