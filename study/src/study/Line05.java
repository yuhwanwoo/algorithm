package study;

import java.util.ArrayList;

public class Line05 {

	public static void main(String[] args) {
		String[][] dataSource= {{"doc1", "t1", "t2", "t3"},{"doc2", "t0", "t2", "t3"},{"doc3", "t1", "t6", "t7"},{"doc4", "t1", "t2", "t4"},{"doc5", "t6", "t100", "t8"}};
		String[] tags= {"t1","t2","t2"};
		
		solution(dataSource, tags);
	}
	public static String[] solution(String[][] dataSource, String[] tags) {
        String[] answer = {};
        ArrayList<String> arr=new ArrayList<>();
        
        System.out.println(dataSource.length);
        System.out.println(dataSource[dataSource.length-1].length);
        
        for(int i=0;i<tags.length;i++) {
        	
        }
        
        /*for(int i=1;i<dataSource[dataSource.length-1].length;i++) {
        	for(int j=0;j<tags.length;j++) {
        		if(dataSource[0][i].equals(tags[j])) {
        			arr.add(dataSource[0][0]);
        		}else if(dataSource[1][i].equals(tags[j])) {
        			arr.add(dataSource[1][0]);
        		}else if(dataSource[2][i].equals(tags[j])) {
        			arr.add(dataSource[2][0]);
        		}else if(dataSource[3][i].equals(tags[j])) {
        			arr.add(dataSource[3][0]);
        		}else if(dataSource[4][i].equals(tags[j])) {
        			arr.add(dataSource[4][0]);
        		}
        	}
        }*/
        for(int i=0;i<arr.size();i++) {
        	System.out.println(arr.get(i));
        }
        return answer;
    }
}
