package if_;

import java.util.Scanner;

public class Practice03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double kor, eng, mat, max, avg;
	String name;
	
	System.out.println("이름 입력 : ");
	name = sc.next();
	System.out.println("국어 점수 :");
	kor = sc.nextDouble();
	System.out.println("영어 점수 :");
	eng = sc.nextDouble();
	System.out.println("수학 점수 :");
	mat = sc.nextDouble();
	max = kor+eng+mat;
	avg = (kor+eng+mat) / 3;
	
	System.out.println(name+"님의 총합 점수는"+max+"이고");
	System.out.printf("평균은%.2f입니다",avg);
	
}
}
