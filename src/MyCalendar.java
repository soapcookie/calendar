import java.time.LocalDate; //���� ��¥�� �ð� ������
import java.time.format.DateTimeFormatter; //���� ��¥�� ��, ��, �� �������� ���
import java.util.Scanner;
public class MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ��¥ ���
				LocalDate today = LocalDate.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy�� MM�� dd��");
				String formattedDate = today.format(formatter);
				System.out.println("���� ��¥: " + formattedDate);
				
				
		Scanner scanner = new Scanner(System.in);
		
		//����ڿ��� ����, �� �Է¹ޱ�
		System.out.print("���� : "); 
		int year = scanner.nextInt();

		System.out.print("�� : ");
		int month = scanner.nextInt();
		
		scanner.close(); ;
		
		
		CalendarFrame printer = new CalendarFrame();
		printer.Calendar(year,month);
		
		CalendarInput printer2 = new CalendarInput();
		
		
	
			}
		}

