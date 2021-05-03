package algorithm;


public class FindMatchingChar {

	public int main(String target, String[] word) {
		
		int totalCnt = 0;
		for(int i=0; i<word.length; i++) {
			int cnt = 0;
			for(int j=0; j<word[i].length(); j++) {
				if(target.indexOf(word[i].charAt(j)) != -1) {
					cnt++;
				}
			}
			if(cnt == word[i].length()) {
				totalCnt++;
			}
			
		}
		return totalCnt;
	}

}
