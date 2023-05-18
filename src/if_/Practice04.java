package if_;
import java.util.Scanner;
public class Practice04 {
public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
   System.out.println("이름을 입력하세요.");
   String name = input.next();
   System.out.println("키를 입력하세요.");
   int height = input.nextInt();
   
   String result = (height>=178)?"이므로 채용이 가능합니다.":"이므로 채용이 불가능합니다.";
   
   System.out.println(name+"님은 키가 "+height+"cm"+result);
   
         
}
}