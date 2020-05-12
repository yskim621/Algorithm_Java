package algorithm;

public class PanlindromeLecture {

	public static void main(String[] args) {
		String msg = "ABCBA";
		int len = msg.length();
		int i;
		// 절반이 되는 지점까지
		// 이 경우 반복문을 끝까지 수행하면 i의 값은 len / 2
		for(i = 0; i < len /2; i = i +1) {
			// 앞에서 글자를 가져오고 뒤에서 글자를 가져와서 비교 (2개의 글자가 다르면 반복문을 중단)
			if(msg.charAt(i) != msg.charAt(len-i-1)) {
				break;
			}
		}
		if(i == len / 2) {
			System.out.println("팰린드롬");
		} else {
			System.out.println("팰린드롬 아님");
		}
	}

}
