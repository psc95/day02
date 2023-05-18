package if_;

import java.util.Scanner;

public class Practice02 {
public static void main(String[] args) {
	// 세개의 정수를 입력받아서 가장 큰수를 출력하게 하세요
	// 출력할때 하나의 정수로 고정을하고 매번 입력받을때마다 큰수만 나오게 해주세요.
	Scanner sc = new Scanner(System.in);
	
	int a, b, c;
	
	System.out.print("1번째 숫자 입력 : ");
	a = sc.nextInt();
	System.out.print("2번째 숫자 입력 : ");
	b = sc.nextInt();
	System.out.print("3번째 숫자 입력 : ");
	c = sc.nextInt();
	
	 if(a<b)
	      a=b;
	   if(a<c)
	      a=c;
	   
	   
	   System.out.println("가장 큰수 : "+a);
	
}
}
