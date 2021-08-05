import java.util.Scanner;

public class SimpleCalendar

{

    private static final int[] MAX= {31, 28, 31, 30, 31, 30 , 31,31,30,31,30,31};

    private static final int[] LEAP_MAX= {31,29, 31, 30, 31, 30 , 31,31,30,31,30,31};

    

    public boolean isLeapYear(int year){

        if (year%4==0 && year%100 != 0)

            return true;

        else

            return false;

    }

	public int getMaxDays(int year,int month) {

	    if (isLeapYear(year))

	        return LEAP_MAX[month-1];

	    else

		    return MAX[month-1];

	}

    

    public int parseDay(String day){

        if (day.equals("su")) return 0;

        else if (day.equals("mo")) return 1;

        else if (day.equals("tu")) return 2;

        else if (day.equals("we")) return 3;

        else if (day.equals("th")) return 4;

        else if (day.equals("fr")) return 5;

        else if (day.equals("sa")) return 6;

        else 

            return 0;

    }

	public void runPrompt(){

	    Scanner scanner=new Scanner(System.in );

		SimpleCalendar cal=new SimpleCalendar();

		

		int month=1;

		int weekday=0;

		

		while (true){

		    

		    

		    System.out.println("give any number of year\n");

		    System.out.print("year>");

		    int year= scanner.nextInt();

		    

		    System.out.println("give any number of month\n");

		    System.out.print("month>");

		    month= scanner.nextInt();

		    

		    if (month>12||month<1)

		        continue;

		    

		    System.out.println("give first weekday of month su mo we th fr sa su \n");

		    System.out.print("weekday>");

		    String str_weekday= scanner.next();

		    weekday=parseDay(str_weekday);

		    

		    printcal(year,month,weekday);

		}

	}

	public void printcal(int year,int month,int weekday){

	    System.out.println(" SU MO TU WE TH FR SA");

	    for (int i=0;i<weekday;i++){

	        System.out.printf("   ");    

	    }
	    

	    

	    int maxdays= getMaxDays(year,month);

	    //print first line

	    int count = 7-weekday;

	    int delim = (count<7)?count : 0;

	    for (int i=1;i<=count;i++){

	        System.out.printf("%3d",i);

	    }

	    System.out.println();

	    for (int i=count+1;i<=maxdays;i++){

	        System.out.printf("%3d",i);

	        if (i%7==delim)

	            System.out.println();

	        

	            

	    }

 	  System.out.println();
 

		

	}

	public static void main(String[] args) {

	    //숫자입력받아 년,월의 달력 출력하는프로그램

	   // 1일의 요일을 입력받음

	   //execute shell

	    SimpleCalendar p=new SimpleCalendar();

	    p.runPrompt();

	    

		

	}

}

