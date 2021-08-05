import java.util.Scanner;
public class Prompt {
	public void runPrompt(){
	    Scanner scanner=new Scanner(System.in );
		Calendar cal=new Calendar();		
		
		
		while (true){
		    
		    
		    System.out.println("give any number of year\n");
		    System.out.print("year>");
		    int year= scanner.nextInt();
		    
		    System.out.println("give any number of month\n");
		    System.out.print("month>");
		    int month= scanner.nextInt();
		    
		    if (month>12||month<1)
		        continue;
		    
		    cal.printcal(year,month);
		}
		
		//scanner.close();
	}
	public static void main(String[] args) {
	    //year month 숫자로 입력받아 년,월의 달력 출력하는프로그램
	   // year month 이용해 요일 구하는 알고리즘 활용
	    Prompt p=new Prompt();
	    p.runPrompt();

	}
}

