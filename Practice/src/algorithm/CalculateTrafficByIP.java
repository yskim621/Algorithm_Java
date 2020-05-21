package algorithm;

import java.io.*;

public class CalculateTrafficByIP {

	public static void main(String[] args) {
		// 텍스트 파일을 읽을 수 있는 스트림을 생성
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("./log.txt")))) {
			// 데이터를 한줄 씩 읽기
			
		} catch(Exception e) {
			System.out.println("읽기 에러");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
