package concept;
/*
 * 
 * 검색
 * 데이터 검색 시에는 ArrayList는 LinkedList에 비해 굉장히 빠르다. 
 * ArrayList는 인덱스 기반의 자료 구조이며 get(int index) 를 통해 O(1) 의 시간 복잡도를 가진다.
 * 그에 비해 LinkedList는 검색 시 모든 요소를 탐색해야 하기 때문에 최악의 경우에는 O(N)의 시간 복잡도를 가진다.
 * 삽입, 삭제
 * LinkedList에서의 데이터의 삽입, 삭제 시에는 ArrayList와 비교해 굉장히 빠른데,
 * LinkedList는 이전 노드와 다음 노드를 참조하는 상태만 변경하면 되기 때문이다.
 *  삽입, 삭제가 일어날 때 O(1)의 시작 복잡도를 가진다.
 *  반면 ArrayList의 경우 삽입, 삭제 이후 다른 데이터를 복사해야 하기 때문에 최악의 경우 O(N) 의 성능을 내게 된다.
 */
public class arraylist_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
