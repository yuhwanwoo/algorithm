package hyundaicard200425;


import java.util.HashMap;

public class Test01 {

	public static void main(String[] args) {
		String[] purchase = { "2019/01/01 5000", "2019/01/20 15000", "2019/02/09 90000" };

		solution(purchase);
	}

	public static int[] solution(String[] purchase) {

		String[] spl = new String[purchase.length];
		int[] price = new int[purchase.length];
		String[] date = new String[purchase.length];
		int[] year = new int[365];
		for (int i = 0; i < purchase.length; i++) {
			spl = purchase[i].split(" ");
			for (int j = 0; j < spl.length; j++) {
				price[i] = Integer.parseInt(spl[1]);
				date[i] = spl[0];
			}
		}
		int[] da;
		da = MtoD(date);
		for (int i = 0; i < da.length; i++) {
			System.out.println(da[i]);
		}

		System.out.println("=========");

		for (int i = 0; i < da.length; i++) {
			for (int j = da[i] - 1; j < da[i] + 29; j++) {
				year[j] = year[j] + price[i];
			}
		}
		for(int i=0;i<year.length;i++) {
			System.out.println(year[i]);
		}
		
		HashMap<String, Integer> hash=new HashMap<>();
		
		for(int i=0;i<year.length;i++) {
			if(year[i]>=10000 & year[i]<20000) {
				hash.put("sil", hash.getOrDefault("sil", 0)+1);
			}else if(year[i]>=20000 & year[i]<50000){
				hash.put("gol", hash.getOrDefault("gol", 0)+1);
			}else if(year[i]>=50000 & year[i]<100000){
				hash.put("pla", hash.getOrDefault("pla", 0)+1);
			}else if(year[i]>=100000){
				hash.put("dia", hash.getOrDefault("dia", 0)+1);
			}else {
				hash.put("bro", hash.getOrDefault("bro", 0)+1);
			}
		}
		
		int[] answer=new int[5];
		answer[0]=hash.get("bro");
		answer[1]=hash.get("sil");
		answer[2]=hash.get("gol");
		answer[3]=hash.get("pla");
		answer[4]=hash.get("dia");
		
		
		return answer;
	}

	public static int[] MtoD(String[] date) {
		String[] spl = new String[date.length];
		int[] day = new int[date.length];

		for (int i = 0; i < date.length; i++) {
			spl = date[i].split("/");
			for (int j = 0; j < spl.length; j++) {
				if (Integer.parseInt(spl[1]) == 1) {
					day[i] = Integer.parseInt(spl[2]);
				} else if (Integer.parseInt(spl[1]) == 2) {
					day[i] = 31 + Integer.parseInt(spl[2]);
				} else if (Integer.parseInt(spl[1]) == 3) {
					day[i] = 59 + Integer.parseInt(spl[2]);
				} else if (Integer.parseInt(spl[1]) == 4) {
					day[i] = 90 + Integer.parseInt(spl[2]);
				} else if (Integer.parseInt(spl[1]) == 5) {
					day[i] = 120 + Integer.parseInt(spl[2]);
				} else if (Integer.parseInt(spl[1]) == 6) {
					day[i] = 151 + Integer.parseInt(spl[2]);
				} else if (Integer.parseInt(spl[1]) == 7) {
					day[i] = 181 + Integer.parseInt(spl[2]);
				} else if (Integer.parseInt(spl[1]) == 8) {
					day[i] = 212 + Integer.parseInt(spl[2]);
				} else if (Integer.parseInt(spl[1]) == 9) {
					day[i] = 243 + Integer.parseInt(spl[2]);
				} else if (Integer.parseInt(spl[1]) == 10) {
					day[i] = 273 + Integer.parseInt(spl[2]);
				} else if (Integer.parseInt(spl[1]) == 11) {
					day[i] = 304 + Integer.parseInt(spl[2]);
				} else if (Integer.parseInt(spl[1]) == 12) {
					day[i] = 334 + Integer.parseInt(spl[2]);
				}

			}
		}

		return day;
	}

}
