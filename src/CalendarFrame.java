import java.util.Calendar; //달력 만들때 유용함
public class CalendarFrame {
	public void Calendar(int year, int month) {
		
		
		//달력 출력 부분
		Calendar calendar = Calendar.getInstance();	//현재 날짜와 시간을 가져오는 메소드, 인스턴스 생성 목적
		calendar.set(year, month - 1, 1);//자바 클래스에서 월은 0부터 시작하므로 1을 빼주기

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
