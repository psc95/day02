package input;

import java.util.Scanner;

public class TestClass01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//  앞쪽은 자료형 뒤쪽은 변수명	
//  ex) Scanner     in 
//	자료형 첫번째 글자가 소문자면 0으로 초기화하고 대문자이면 null로 초기하 해야함 ex)String
	
	int age;
	String name;
	
	System.out.print("이름 입력 : ");
	name = sc.next();
	System.out.println("나이 입력 : ");
	age = sc.nextInt();
	
	System.out.println("당신 이름은 "+name+"이며");
	System.out.println("나이는 "+age+"살 이군요");
	
}
}
