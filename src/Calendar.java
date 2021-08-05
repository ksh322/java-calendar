import java.util.Scanner;
public class Calendar
{
    private static final int[] MAX= {0,31, 28, 31, 30, 31, 30 , 31,31,30,31,30,31};
    private static final int[] LEAP_MAX= {0,31,29, 31, 30, 31, 30 , 31,31,30,31,30,31};
    
    public boolean isLeapYear(int year){
        if (year%4==0 && year%100 != 0||year%400==0)
            return true;
        else
            return false;
    }
	public int getMaxDays(int year,int month) {
	    if (isLeapYear(year))
	        return LEAP_MAX[month];
	    else
		    return MAX[month];
	}
    public int getWeekday(int year,int month,int day){
        int syear=1970;
        
        int sweekday=4; //1970.1.1 thursday: 표준날짜
        
        int count = 0;
        
        for (int i=syear;i < year; i++){
            if (isLeapYear(i))
                count+=366;
            else
                count+=365;
        }
        
        for (int i=1;i<month;i++){
            int delta= getMaxDays(year,i);
            count+=delta;
        }
        
        count+=day-1;
        int weekday = (count+sweekday)%7;
        return weekday;
    };
    public int parseDay(String day){
        switch(day){
        case "su": 
            return 0;
            
        case "mo":
            return 1;
            
        case "tu" :
            return 2;
        case "we" :
            return 3;
        case "th" :
            return 4;
        case "fr" :
            return 5;
        case "sa" :
            return 6;
       
    }
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

	public void printcal(int year,int month){
	    System.out.println(" SU MO TU WE TH FR SA");
	    int weekday = getWeekday(year,month,1);
	    
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
	    //second line~
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
	   // year month 입력받으면 요일 구하는 알고리즘 활용
	    Calendar p=new Calendar();
	    

	}
}
