package concept.array;

import java.util.ArrayList;
import java.util.Collections;

public class MapleStoryUserList {

	public static void main(String args[]) {
		ArrayList<MapleStoryUser> userList = new ArrayList<MapleStoryUser>();
		MapleStoryUser user1 = new MapleStoryUser("메이플운영자", "운영진길드", 250, 9999999);
		MapleStoryUser user2 = new MapleStoryUser("헤네시스소음", "모바일길드", 173, 980000);
		MapleStoryUser user3 = new MapleStoryUser("커닝미세먼지", "모바일길드", 199, 1300000);
		MapleStoryUser user4 = new MapleStoryUser("엘리니아벌레", "", 83, 3200000);
		MapleStoryUser user5 = new MapleStoryUser("페리온치약", "파이썬길드", 125, 2600000);
		MapleStoryUser user6 = new MapleStoryUser("썬콜의파워", "자바길드", 143, 1900000);
		MapleStoryUser user7 = new MapleStoryUser("표도손목스냅", "", 230, 1100000);
		MapleStoryUser user8 = new MapleStoryUser("전사의삼두근", "인바디클럽", 207, 2500000);
		MapleStoryUser user9 = new MapleStoryUser("궁수의복싱", "복싱길드", 221, 600000);
		MapleStoryUser user10 = new MapleStoryUser("드디어마지막", "힘들다길드", 225, 1620000);
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		userList.add(user5);
		userList.add(user6);
		userList.add(user7);
		userList.add(user8);
		userList.add(user9);
		userList.add(user10);
		
		// 배열을 사용할 때는
		// Arrays.sort(userList); 로 하면 된다.
		Collections.sort(userList);
		
		System.out.println("compareTo에 의해 정렬되었다");
		for (int i = 0; i < userList.size(); i++) {
			System.out.print(userList.get(i).getNickName() + " / ");
		}
		System.out.println();
		for (int i = 0; i < userList.size(); i++) {
			System.out.print(userList.get(i).getMoney() + " / ");
		}
	}
}
