package concept.array;

import java.util.ArrayList;
import java.util.Collections;

public class MapleStoryUserList {

	public static void main(String args[]) {
		ArrayList<MapleStoryUser> userList = new ArrayList<MapleStoryUser>();
		MapleStoryUser user1 = new MapleStoryUser("�����ÿ��", "������", 250, 9999999);
		MapleStoryUser user2 = new MapleStoryUser("��׽ý�����", "����ϱ��", 173, 980000);
		MapleStoryUser user3 = new MapleStoryUser("Ŀ�׹̼�����", "����ϱ��", 199, 1300000);
		MapleStoryUser user4 = new MapleStoryUser("�����Ͼƹ���", "", 83, 3200000);
		MapleStoryUser user5 = new MapleStoryUser("�丮��ġ��", "���̽���", 125, 2600000);
		MapleStoryUser user6 = new MapleStoryUser("�������Ŀ�", "�ڹٱ��", 143, 1900000);
		MapleStoryUser user7 = new MapleStoryUser("ǥ���ո񽺳�", "", 230, 1100000);
		MapleStoryUser user8 = new MapleStoryUser("�����ǻ�α�", "�ιٵ�Ŭ��", 207, 2500000);
		MapleStoryUser user9 = new MapleStoryUser("�ü��Ǻ���", "���̱��", 221, 600000);
		MapleStoryUser user10 = new MapleStoryUser("�������", "����ٱ��", 225, 1620000);
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
		
		// �迭�� ����� ����
		// Arrays.sort(userList); �� �ϸ� �ȴ�.
		Collections.sort(userList);
		
		System.out.println("compareTo�� ���� ���ĵǾ���");
		for (int i = 0; i < userList.size(); i++) {
			System.out.print(userList.get(i).getNickName() + " / ");
		}
		System.out.println();
		for (int i = 0; i < userList.size(); i++) {
			System.out.print(userList.get(i).getMoney() + " / ");
		}
	}
}