package hyundaicard200425;

public class Test02 {

	public static void main(String[] args) {
		String[] registered_list = { "cow", "cow1", "cow2", "cow3", "cow4", "cow9", "cow8", "cow7", "cow6", "cow5" };
		String new_id = "cow";
		solution(registered_list, new_id);
	}

	public static String solution(String[] registered_list, String new_id) {
		String answer = "";
		char[] a = new_id.toCharArray();
		int indexpan = 0;
		String n="";
		
		for (int i = 0; i < a.length; i++) {

			if ((int) a[i] >= 49 & 59 >= (int) a[i]) {
				indexpan = i;
			} else {
				indexpan = -1;
			}
		}
		
		
		char[] S = new char[indexpan];
		char[] N;
		
		if (indexpan == -1) {
			N = new char[a.length - indexpan + 1];
			for (int i = 0; i < N.length; i++) {
				N[i] = a[indexpan + i - 1];
				System.out.println(N[i]);
				
			}
			 n = new String(N);
		} else {
			N = null;
		}

		for (int i = 0; i < S.length - 1; i++) {
			S[i] = a[i];
			System.out.println(S[i]);
		}

		String s = new String(S);
		

		System.out.println(s.length());

		int cnt = registered_list.length;
		while (cnt > 0) {
			for (int i = 0; i < registered_list.length; i++) {
				if (new_id.equals(registered_list[i])) {
					answer = s + (Integer.parseInt(n) + 1);

				} else {
					answer = new_id;
				}
			}

			cnt--;
		}
		System.out.println(answer);
		return answer;
	}
}
