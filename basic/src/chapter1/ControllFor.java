package chapter1;

public class ControllFor {

	public static void main(String[] args) {
		// 반복문 : 특정 조건에 만족하면 지정한 코드 블럭을 반복 실행하도록 하는 것
		
		// for 문 : 일반적으로 반복 횟수가 정해져 있을때 사용하는 반복문
		// for (조건에사용할변수초기화 ; 조건 ; 조건에사용할변수변경){반복할 코드블럭}
		
		/*
		   System.out.println("안녕하세요. "); 1000번 출력
		for (int count = 1; count <= 1000; count++) {
			//System.out.println("안녕하세요. ");
		}
		 */
		
		/*
		System.out.println("4 * 1 = 4");
		System.out.println("4 * 2 = 8");
		System.out.println("4 * 3 = 12");
		System.out.println("4 * 4 = 16");
		System.out.println("4 * 5 = 20");
		System.out.println("4 * 6 = 24");
		System.out.println("4 * 7 = 28");
		System.out.println("4 * 8 = 32");
		System.out.println("4 * 9 = 36");
        */
		for (int count = 1; count <= 9; count++) {
			System.out.println("4 * " + count + " = " + (4*count));
		}
		// count++ -->> count = count + 1 -->> count += 1
		// 홀수 곱셈만 내고 싶다면 count += 2  ------@@@@@
		
		String[] fruits = new String[] {"apple", "banana", "cacao"};
//		System.out.println(fruits[0]);
//		System.out.println(fruits[1]);
//		System.out.println(fruits[2]);
		
		for (int index = 0; index < fruits.length; index++) {   // (fruits.length)는 배열의 길이를 모를 때 
			System.out.println(fruits[index]);	
		}
		// 위의 for문이 종료되면서 int index는 날라감.그러므로 아래에 다시 int index 사용 가능
		
		for (int index = 0; index < fruits.length; index++) {
			fruits[index] += " add";
		}
		
		// foreach : 컬렉션(배열)의 각 요소를 하나씩 변수에 복사하여 사용하는 반복문, 향상된 for문
		// 컬렉션 실제 요소에 대해서 읽기전용, 복사한 요소를 변경하더라도 실제 요소에는 영향이 없음!!!
		for (String fruit: fruits) {
			System.out.println(fruit);
		}                                //------@@@@@

		for (String fruit: fruits) {
			fruit += "add";
		}
		for (String fruit: fruits) {
			System.out.println(fruit);
		}
	}

}
