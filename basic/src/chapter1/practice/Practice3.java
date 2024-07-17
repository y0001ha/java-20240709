package chapter1.practice;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		/*
		    문자열 자르기
		    사용자로부터 시작인덱스와 종료인덱스를 입력받고
		    입력받은 시작 인덱스와 종료 인덱스까지 문자열을 잘라서 
		    자른 문자열을 출력
		    
		    String 기능 subString을 사용하지 않고 char[]을 이용해서 작성
		    */
		    
		    		
		String statement = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 잘 못 그린 기린 그림이다.";
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작인덱스 : ");
		int startIndex = scanner.nextInt();
		System.out.print("종료인덱스 : ");
		int endIndex = scanner.nextInt();
		
		scanner.close();
		
		char[] statementChars = statement.toCharArray();
		char[] resultChars = new char[endIndex - startIndex];
		
		for (int index = 0; index < resultChars.length; index++) {
			resultChars[index] = statementChars[startIndex + index];
		}
		
		System.out.println(resultChars);
		
		
		
		
//		char[] statementChars = new char[statement.length()];
//		for (int index = 0 ; index < statementChars.length ; index++) {
//			statementChars[index] = statement.charAt(index);
//		}
//		
//		char[] ResultChars = new char[statementChars.length - startIndex];
//		for (int index = startIndex ;  index <= endIndex ; index++) {
//			ResultChars[index] = 
//		}
//		
//		
//		
//		System.out.println(ResultChars);
		
		
		
		
				

	}

}
