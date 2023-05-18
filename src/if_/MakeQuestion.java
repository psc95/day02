package if_;

import java.util.Scanner;

public class MakeQuestion {
public static void main(String[] args) {
	//Q)숫자 3개를 입력받고 가장 큰 수를 골라내는 문제
	Scanner sc = new Scanner(System.in);
	
	int a, b, c, max;
	
	System.out.println("3개의 숫자 중가장 큰 수 골라내기");
	System.out.println("정수만 입력하세요!!!");
	
	System.out.println("1번째 숫자를 입력 : ");
	a = sc.nextInt();
	System.out.println("2번째 숫자를 입력 : ");
	b = sc.nextInt();
	System.out.println("3번째 숫자를 입력 : ");
	c = sc.nextInt();
	max = a;	//a 를 max값으로 만든다.
	
	if(b > max) { // b가 max보다 클 경우 b가 max가 됨
		max = b;
	}
	if(c > max) { // c가 max보다 클 경우 c가 max가 됨
		max = c;
	}
	System.out.println("가장 큰 수는" +max+ "입니다.");
	
	
}
}
