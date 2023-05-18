package if_;

import java.util.Scanner;

public class Practice01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double d;
	String name;
	
	System.out.println("이름 입력 : ");
	name = sc.next();
	System.out.println("키 입력 : ");
	d = sc.nextDouble();
	
	if(d >=160.0) {
		System.out.println(name+"님의 키는"+d+"cm이므로 채용되었습니다.");
	}
	if(d < 160.0) {
		System.out.println(name+"님의 키는"+d+"cm이므로 채용되지못하였습니다.");
	}
}
}
