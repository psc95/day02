package input;

import java.util.Scanner;

public class Exam {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String name;
	int kor, eng, math;
	
	
	System.out.print("당신의 이름은 무엇입니까? ");
	name = sc.next();
	System.out.print(name +"님의 국어 점수 : ");
	kor = sc.nextInt();
	System.out.print(name +"님의 영어 점수 : ");
	eng = sc.nextInt();
	System.out.print(name +"님의 수학 점수 : ");
	math = sc.nextInt();
	int avg = kor+eng+math;
	
	
	System.out.println("================================");
	System.out.println("이 름 : " + name);
	System.out.println("================================");
	System.out.println("국 어 : " + kor);
	System.out.println("영 어 : " + eng);
	System.out.println("수 학 : " + math);
	System.out.println("================================");
	System.out.println("합 계 : " + avg );
	System.out.println("================================");
	
	
}
}
