package chapter1;

public class Operator {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 2;
		double c = 15.0;
		double d = 7.0;
		
		int intresult = 0;
		double doubleresult = 0.0;
		
		// 산술 연산자 : 숫자 데이터에 대해 사칙연산을 수행
		
		// 더하기 : +
		// 좌항에 우항을 더한 값을 반환
		intresult = a + b;
		System.out.println(intresult);
		System.out.println(c + d);
		System.out.println(a + c); //-->> 모든 연산에는 실수가 하나라도 포함되면 실수로 나옴
		
		// 빼기 : -
		// 좌항에 우항을 뺀 값을 반환
		intresult = a - b;
		System.out.println(intresult);
		doubleresult = c - d;
		System.out.println(doubleresult);
		doubleresult = a - c;
		System.out.println(doubleresult);
		
		// 곱하기 : *
		// 좌항에 우항을 곱한 값을 반환
		intresult = a * b;
		System.out.println(intresult);
		doubleresult = c * d;
		System.out.println(doubleresult);
		doubleresult = a * c;
		System.out.println(doubleresult);
		
		// 나누기 : /
		// 좌항에 우항을 나눈 값을 반환
		// 정수와 정수를 나누면 실수부가 소멸함
		intresult = a / b;
		System.out.println(intresult);
		doubleresult = c / d;
		System.out.println(doubleresult);
		doubleresult = a / d;
		System.out.println(doubleresult);
		
		// 나머지 : %
		// 좌항에 우항을 나눈 나머지 값을 반환
		intresult = a % b;
		System.out.println(intresult);
		doubleresult = c % d;
		System.out.println(doubleresult);
		
		// 증감 연산자
		// 피연산자의 값을 1 증가 혹은 감소
		// 피연산자가 반드시 변수여야함
	    // 증가 연산자 : ++
		// 감소 연산자 : --
		int number = 5;
		number++;
		System.out.println(number); // 6
		number--;
		System.out.println(number); // 5
		
		// number = 5
		System.out.println(number++); // ---->> 변수를 읽어드리고 연산
		System.out.println(++number); // ---->> 연산을 하고 변수를 읽음
		System.out.println(number--); 
		System.out.println(--number);
		
		final int NUMBER = 5;
		// NUMBER++;  --->> 상수 선언되어 작업 불가능
		// 5++; --->> 리터럴 상수라 작업 불가능
		
		// 대입 연산자 : 좌항에 우항을 할당
		
		// 일반 대입 연산자 : =
		// 좌항에 우항의 연산 결과를 할당
		number = 10 + 5;
		// 좌항이 일반 변수와 상수형 변수 모두 올 수 있음
		// 단, 상수형 변수는 초기화 시에만 사용 가능
		int v = 10; // 일반변수
		final int v1 = 10; // 상수형 변수도 가능, 초기화에만
		
		// 복합 대입 연산자 : 타연산자=
		// 좌항에 좌항과 우항을 연산한 결과를 할당
		// 전제 조건 : 좌항은 반드시 초기화가 되어있어야 함
		// 좌항은 반드시 일반 변수가 와야함 (상수 불가능)
		number += 3;
		System.out.println(number);
		number /= 7;
		System.out.println(number);
		
		// 비교 연산자 : 좌항과 우항을 비교해서 그 결과를 논리값으로 반환
		boolean booleanResult;
		
		// 같다, 다르다 연산
		// == : 좌항이 우항과 같으면 true, 다르면 false
		// != : 좌항이 우항과 같으면 false, 다르면 true
		booleanResult = a == c;
		System.out.println(booleanResult);
		booleanResult = a != c;
		System.out.println(booleanResult);
		
		// 작다, 작거나 같다 연산
		// < : 좌항이 우항과 작으면 true, 크거나 같으면 false
		// <= : 좌항이 우항과 작거나 같으면 true, 크면 false
	    booleanResult = a < c;	
	    System.out.println(booleanResult);
	    booleanResult = a <= c;	
	    System.out.println(booleanResult);
	    
	    // 크다, 크거나 같다 연산
	    // > : 좌항이 우항과 크면 true, 작거나 같으면 false
	    // >= : 좌항이 우항과 크거나 같으면 true, 작으면 false
        booleanResult = a > c;	
        System.out.println(booleanResult);
        booleanResult = a >= c;	
        System.out.println(booleanResult); 
        
        // 논리 연산자 : 피연산자가 모두 논리형태, 피연산자를 조합 함
        // 논리 AND 연산자 : && 좌항과 우항이 모두 true이면 true, 하나라도 false이면 fasle
        booleanResult = true && true;
        System.out.println(booleanResult); 
        booleanResult = (a > b) && (a <= c);
        
        // 논리 OR 연산자 : || 좌항과 우항 중 하나라도 true이면 true, 모두 false이면 fasle
        booleanResult = false || true;
        System.out.println(booleanResult); 
        booleanResult = (a == b) || (c == d);
        System.out.println(booleanResult); 
        
        // 논리 NOT 연산자 : ! true이면 flase, false이면 true 
        System.out.println(!booleanResult); 
        
        booleanResult = (a < b) && (++a > 0);
        System.out.println(a); // --->> 좌항이 이미 false라 우항은 죽음
        
        booleanResult = (a > b) || (++a > 0);
        System.out.println(a);
        // ---> 리액트에 조건문처럼 사용 가능 , 코딩테스트에도
      
        
        // 삼항 연산자 : 조건에 따라 지정한 결과를 반호나하는 연산자
        // 조건(논리식) ? 참일때결과 : 거짓일때결과
        int age = 20;
        String stringResult = age > 19 ? "성인" : "미성년자"; 
    	System.out.println(stringResult);
        
    
		
	}

}