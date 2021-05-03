package algorithm;

public class ReverseString {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String str = "abcdefghijklmnopqrstuvwxyz";
		/*
		for(int i=1; i<=str.length(); i++) {
			 sb.append(str.charAt(str.length()-i));
		}
		*/
		sb.append(str).reverse();
		System.out.print(sb.toString());
		
	}

}
