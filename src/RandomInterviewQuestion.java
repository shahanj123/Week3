
public class RandomInterviewQuestion {

	public static void main(String[] args) {
		int x,i;
		x = 20;
		String result = " 1";
		for(i=2; i <=x; i++) {
			if (i % 3 == 0 & i % 5 ==0) {
				result += ", XP Lab";
				continue;
			}
			if(i % 3 == 0) {
				result +=", XP";
				continue;
			}
			if(i % 5 == 0) {
				result +=", Lab";
				continue;
			}
			result += ", " + i;
		}
		return;
			

		}
			
	}
