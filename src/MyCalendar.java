import java.util.Calendar; //달력 만들때 유용함
import java.util.Scanner;
import java.time.LocalDate; //현재 날짜와 시간 가져옴
import java.time.format.DateTimeFormatter; //오늘 날짜를 년, 월, 일 형식으로 출력
public class MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();	//현재 날짜와 시간을 가져오는 메소드, 인스턴스 생성 목적
		//오늘 날짜 출력
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String formattedDate = today.format(formatter);
		System.out.println("오늘 날짜: " + formattedDate);
		
		//사용자에게 연도, 월 입력받기
		System.out.print("연도 : "); 
		int year = scanner.nextInt();

		System.out.print("월 : ");
		int month = scanner.nextInt();
		scanner.close(); ;
		
		//달력 출력 부분
		calendar.set(year, month - 1, 1);

		// 해당 달의 마지막 일자(DATE) 얻기
		int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		// 해당 달의 시작 요일 얻기
		// 1: 일요일 2: 월요일, 3: 화요일 ....
		int startDay = calendar.get(Calendar.DAY_OF_WEEK);

		System.out.println("--------------------[" + year + "년 " + month + "월"+"]--------------------\n");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
			
		int currentDay = 1;
			
		for (int i = 0; i <= 42; i++) { //달력의 총 칸 수 출력
			   if (i < startDay) {
			       System.out.print("\t"); //시작 요일 이전까지는 공백으로 출력
			   } else {
			       System.out.printf("%d\t", currentDay);
			       currentDay++; //시작 요일부터 날짜들을 1일씩 증가
			   }
			
			   if (i % 7 == 0) { //일주일의 마지막 칸인 경우, 즉 7의 배수인 경우에는 줄바꿈을 수행
			       System.out.println();
			   }
			
			   if (currentDay > lastDay) { //증가한 현재 날짜가 마지막 날짜보다 큰 경우, 반복문 종료
			       break;
			   }
		}
			}
		}

