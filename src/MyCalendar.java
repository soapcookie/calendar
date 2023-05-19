import java.util.Calendar; //�޷� ���鶧 ������
import java.util.Scanner;
import java.time.LocalDate; //���� ��¥�� �ð� ������
import java.time.format.DateTimeFormatter; //���� ��¥�� ��, ��, �� �������� ���
public class MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();	//���� ��¥�� �ð��� �������� �޼ҵ�, �ν��Ͻ� ���� ����
		//���� ��¥ ���
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy�� MM�� dd��");
		String formattedDate = today.format(formatter);
		System.out.println("���� ��¥: " + formattedDate);
		
		//����ڿ��� ����, �� �Է¹ޱ�
		System.out.print("���� : "); 
		int year = scanner.nextInt();

		System.out.print("�� : ");
		int month = scanner.nextInt();
		scanner.close(); ;
		
		//�޷� ��� �κ�
		calendar.set(year, month - 1, 1);

		// �ش� ���� ������ ����(DATE) ���
		int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		// �ش� ���� ���� ���� ���
		// 1: �Ͽ��� 2: ������, 3: ȭ���� ....
		int startDay = calendar.get(Calendar.DAY_OF_WEEK);

		System.out.println("--------------------[" + year + "�� " + month + "��"+"]--------------------\n");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			
		int currentDay = 1;
			
		for (int i = 0; i <= 42; i++) { //�޷��� �� ĭ �� ���
			   if (i < startDay) {
			       System.out.print("\t"); //���� ���� ���������� �������� ���
			   } else {
			       System.out.printf("%d\t", currentDay);
			       currentDay++; //���� ���Ϻ��� ��¥���� 1�Ͼ� ����
			   }
			
			   if (i % 7 == 0) { //�������� ������ ĭ�� ���, �� 7�� ����� ��쿡�� �ٹٲ��� ����
			       System.out.println();
			   }
			
			   if (currentDay > lastDay) { //������ ���� ��¥�� ������ ��¥���� ū ���, �ݺ��� ����
			       break;
			   }
		}
			}
		}

