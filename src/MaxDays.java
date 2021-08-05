import java.util.Scanner;
public class MaxDays {
	private static final int[] MAX= 
		{31, 28, 31, 30, 31, 30 , 31,31,30,31,30,31}; //배열={}
	public int getMaxDays(int month) {
		return MAX[month-1];
	}
	
	public static void main(String[] args) {
		
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

		//숫자를 입력받아 해당 월의 최대일수 출력 2월 ->28 by array
		
		//원하는 입력횟수를 먼저 입력받는다.
		Scanner scanner= new Scanner(System.in);
		MaxDays cal = new MaxDays();
		System.out.printf("give number of inputs \n");
		String s1= scanner.next();
		int times = Integer.parseInt(s1);
		
		for (int i=0;i<times;i++) {
		System.out.printf("give any month by number \n");
		String s2= scanner.next();
		int m = Integer.parseInt(s2);
				
		System.out.printf("%d 월의 최대일수는 %d 일 입니다 \n",m, cal.getMaxDays(m));
		}
		scanner.close();
		
	}

}

