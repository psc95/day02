package operator;

public class TestClass01 {
public static void main(String[] args) {
	/*
	 +, -, *, /, %
	 / : 정수 / 정수 = 정수
	 / : 정수 / 실수 = 실수(연산 중 하나라도 실수가 있다면 결과는 실수)
	 %(mod) : 정수 % 정수 = 나머지 값
	 어떤수가 짝수/홀수, 배수 구분할때 사용한다
	 */
	
	int n1 = 9, n2 = 2;
	System.out.println( n1 + n2 );
	System.out.println( n1 - n2 );
	System.out.println( n1 * n2 );
	System.out.println( n1 / n2 ); // 정수 / 정수는 결과값이 몫이 나옴
	System.out.println( n1 / (float)n2 );
	System.out.println( n1 % n2 );
	
	/*
	 복합대입 연산자
	 n1 = 5;
	 n1 += 10; // n1 = n1 + 10;
	 n1 -= 10; // n1 = n1 - 10;
	 n1 /= 10; // n1 = n1 / 10;
	 n1 %= 10; // n1 = n1 % 10;
	 */
	
	System.out.println("==== 복합대입 연산자 ====");
	n1 = n2 = 5;
	n1 += 1; // n1 = n1 + 1
	System.out.println( n1 ); //6
	n1 -= 1; // n1 = n1 - 1
	System.out.println( n1 ); //5
	
	n1 *= n2; // n1 = n1 * n2
	System.out.println( n1 ); //25
	n1 /= n2; // n1 = n1 / n2
	System.out.println( n1 ); //5
	n1 %= n2; // n1 = n1 % n2
	System.out.println( n1 ); //0
	
	/*
	 관계 연산자
	 - 결과적으로 true 또는 false를 알려준다
	 n1 = 10, n2 =5;
	 >, <, >=, <=, ==, !=
	 n1 > n2 = true
	 n1 <= n2 = false
	 n1 == n2 = false
	 n1 != n2 = true
	 */
	 System.out.println("==== 관계 연산자 ====");
	 n1 = 10; n2 = 5;
	 System.out.println( n1 > n2); // true
	 System.out.println( n1 == n2);// false
	 System.out.println( n1 == 10);// true
	 System.out.println( n1 != n2);// true
	 System.out.println( n1 != 10);// false
	 /*
	  논리 연산자
	  ||(or) : 식 중 하나라도 true(참)이면 결과는 true(참)이다
	  &&(and) : 모두가 참일때 결과는 참이다.
	  		  - 하나라도 거짓이면 결과는 거짓
	  !(not) : 결과를 반전시켜준다
	  		 - !true => false, !false => true 
	  */
	 System.out.println("==== 논리 연산자 ====");
	 System.out.println(" -- or --");
	 System.out.println( true || true);
	 System.out.println( true || false);
	 System.out.println( false || false);
	
	 System.out.println(" -- and --");
	 System.out.println( true && true);
	 System.out.println( true && false);
	 System.out.println( false && false);
	 System.out.println( 10 > 5 && 10 > 2);
	 System.out.println(" --- not ---");
	 System.out.println( !true );
	 System.out.println( !(10 < 5) );
	 
	 /*
	  증감 연산자
	  - 결과적으로 자기 자신을 1증가 또는 감소
	  n1 = 10;
	  n1++; => n1 = n1 + 1; 같은의미
	  ++n1; => n1 = n1 + 1; 
	  --n1; => n1 = n1 - 1;
	  n1--; => n1 = n1 - 1;
	  */
	  
	 n1 = 10;
	 n2 = n1++ + 10;
	 System.out.println(n1);
	 System.out.println(n2);
	 
	 n1 = 10;
	 n2 = ++n1 + 10;
	 System.out.println(n1);
	 System.out.println(n2);
	
	
}
}
