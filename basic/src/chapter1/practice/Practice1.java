package chapter1.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {

	/*
	    사용자로 부터 0이상의 정수를 입력받고 
	    입력받은 숫자를 numbers라고 하는 배열에 저장
	    만약 사용자가 0미만의 정수를 입력하면
	    사용자가 입력한 정수들을 모두 출력하면 프로그램을 종료
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[0];       //-->> 사용자가 몇개를 입력할지 모르기 때문에
		
		while (true) {       //-->> 지속적으로 받기위해 
			System.out.print("정수 : ");
			int inputNumber = scanner.nextInt();
			
			if (inputNumber < 0) break;
			
			int[] newNumbers = new int[numbers.length + 1];
			
			for (int index = 0; index < numbers.length; index++) {
				newNumbers[index] = numbers[index];
			}
			
			newNumbers[newNumbers.length -1] = inputNumber;
			// newNumbers = {2}
			numbers = newNumbers;
		}
		
		//for (int number: numbers) System.out.println(number);
		System.out.println(Arrays.toString(numbers));
		
		

	}

}
