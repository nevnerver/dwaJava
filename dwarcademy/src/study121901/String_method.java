package study121901;

import java.util.Arrays;
import java.util.Scanner;

public class String_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="i like banana chacha";

//		1. 문자열에서 특정 문자 추출
		char ch = word.charAt(2);
		System.out.println( ch );
		
		Scanner scan = new Scanner(System.in);
		ch = scan.next().charAt(0);
		System.out.println( ch );
		
//		2. 문자열 비교 - equals()
		if ( word.equals("i like") )
			System.out.println( "같다" );
		else
			System.out.println( "같지않다" );
		
//		3. 문자열을 byte로 변환 - getBytes()
		byte[] code = word.getBytes();
		System.out.println( Arrays.toString( code ) );
		
//		4. 문자열에서 특정 문자열의 위치를 리턴 - indexOf()
		int k = word.indexOf('k');
		System.out.println( k );
		int banana = word.indexOf("banana");
		System.out.println( banana );
		
		int a5 = word.indexOf('a', 10);
		System.out.println( a5 );
		int cha = word.indexOf("ch", 15);
		System.out.println( cha );
		
//		5. 문자열의 길이 - length()
		int len = word.length();
		System.out.println("문자열 길이 : " + len);
		
//		6. 문자열 변경(치환) - replace()
		String temp = word.replace("banana chacha", "rescue tayo");
		System.out.println("원본 : " + word);
		System.out.println("변경후 : " + temp);
		
//		자바스크립트에서 정규표현식을 이용하여 문자열 변경
//		자바에서도 정규표현식을 사용한다.
//		[^0-9] 
//		특수문자 제거 [^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9]	
		
		temp = word.replaceAll( "a" , "c" );
		//a.을 하면 a 뒤에있는걸 c로 바꾸어라
		System.out.println( temp );
	
		temp = "010-1234-5678";
		temp = temp.replaceAll("[^0-9]" , "");
		System.out.println(temp);
		
		
		
	}
}
