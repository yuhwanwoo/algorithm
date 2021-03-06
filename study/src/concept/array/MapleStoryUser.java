package concept.array;

public class MapleStoryUser implements Comparable<MapleStoryUser> {
	private String nickName;
	// 닉네임
	private String guildName;
	// 길드명
	private int level;
	//레벨
	private int money;
	//보유 메소
	//생성자
	public MapleStoryUser(String nickName, String guildName, int level, int money) {
		this.nickName = nickName;
		this.guildName = guildName;
		this.level = level;
		this.money = money;
	}
	//Getter Setter
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getGuildName() {
		return guildName;
	}
	public void setGuildName(String guildName) {
		this.guildName = guildName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	//닉네임순으로 정렬하고 싶을때
	/*@Override
	public int compareTo(MapleStoryUser user) {
		// TODO Auto-generated method stub
		return this.nickName.compareTo(user.getNickName());
	}*/
	
	
	// 돈 순으로 정렬하고 싶을때
	@Override
	public int compareTo(MapleStoryUser user) {
		// TODO Auto-generated method stub
		return ((Integer)money).compareTo(user.getMoney());
	}
}
