import java.time.LocalDate; //현재 날짜와 시간 가져옴
import java.time.format.DateTimeFormatter; //오늘 날짜를 년, 월, 일 형식으로 출력
import java.util.Scanner;
public class MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오늘 날짜 출력
				LocalDate today = LocalDate.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
				String formattedDate = today.format(formatter);
				System.out.println("오늘 날짜: " + formattedDate);
				
		Scanner scanner = new Scanner(System.in);
		
		//사용자에게 연도, 월 입력받기
		System.out.print("연도 : "); 
		int year = scanner.nextInt();

		System.out.print("월 : ");
		int month = scanner.nextInt();
		scanner.close(); ;
		
		CalendarFrame printer = new CalendarFrame();
		printer.Calendar(year,month);
		
	
			}
		}

