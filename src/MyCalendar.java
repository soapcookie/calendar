//Java8부터 날짜 및 시간을 처리하기 위한 새로운 API 제공
import java.time.LocalDate; // 원하는 연도와 월에 해당하는 달력 생성
import java.time.YearMonth; // 해당 월의 첫 번째 일과 마지막일 구하기
import java.time.format.DateTimeFormatter; //오늘 날짜를 년, 월, 일 형식으로 출력
import java.util.Scanner;

public class MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		
		//오늘 날짜 출력
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
	        String formattedDate = today.format(formatter);
	        System.out.println("오늘 날짜 : " + formattedDate);
		
	    //--------------------사용자 입력부분--------------------
		System.out.print("연도 : ");  //연도 입력
		int year = scanner.nextInt();
		
		System.out.print("월 : "); //월 입력
		int month = scanner.nextInt();
		scanner.close(); 
		
		 //--------------------------달력 출력 부분--------------------------
		//YearMonth 객체 생성
		YearMonth yearMonth = YearMonth.of(year, month);
		
		//해당 월의 마지막 날 객체
		LocalDate lastDayOfMonth = yearMonth.atEndOfMonth(); 
		
		int startWeek = 7; //해당 월의 첫째주
		
		int lastDay = getLastDayOfMonth(year, month); //해당 월의 마지막 날
		
        System.out.println("-------------------["+year+"년 "+month+"월]-------------------");
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        
        //1일 이전 요일들에는 공백을 채우기 위한 조건문
        int day = 1;
		switch (startWeek) {
            case 7:
                System.out.print(" \t");
            case 6:
                System.out.print(" \t");
            case 5:
                System.out.print(" \t");
            case 4:
                System.out.print(" \t");
            case 3:
                System.out.print(" \t");
            case 2:
                System.out.print(" \t");
        }

     
        int countDay = startWeek;
		for (int i = 1; i <= lastDay; i++) {
            System.out.print(i + "\t");
            if (countDay % 7 == 0) { //일주일이 지나면 다음 줄로 출력
                System.out.println();
            }
            countDay++;
        }
    }
	//입력받은 연도 해당 월의 마지막 날짜 구하기
	private static int getLastDayOfMonth(int year, int month){//메소드 내에서는 타입을 명시해야함 {
	    return YearMonth.of(year, month).lengthOfMonth();
	}
}
		

	
