import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		int a,b;
		Scanner scanner= new Scanner (System.in);
		String s1,s2;
		System.out.println("두수를입력하세요");

		s1= scanner.next();
		s2= scanner.next();
		a= Integer.parseInt(s1);
		b= Integer.parseInt(s2);
		
		
		System.out.printf("두수의 합은 %d" ,a+b);
		scanner.close();
	}
	
}
