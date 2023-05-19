//Java8���� ��¥ �� �ð��� ó���ϱ� ���� ���ο� API ����
import java.time.LocalDate; // ���ϴ� ������ ���� �ش��ϴ� �޷� ����
import java.time.YearMonth; // �ش� ���� ù ��° �ϰ� �������� ���ϱ�
import java.time.format.DateTimeFormatter; //���� ��¥�� ��, ��, �� �������� ���
import java.util.Scanner;

public class MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		
		//���� ��¥ ���
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy�� MM�� dd��");
	        String formattedDate = today.format(formatter);
	        System.out.println("���� ��¥ : " + formattedDate);
		
	    //--------------------����� �Էºκ�--------------------
		System.out.print("���� : ");  //���� �Է�
		int year = scanner.nextInt();
		
		System.out.print("�� : "); //�� �Է�
		int month = scanner.nextInt();
		scanner.close(); 
		
		 //--------------------------�޷� ��� �κ�--------------------------
		//YearMonth ��ü ����
		YearMonth yearMonth = YearMonth.of(year, month);
		
		//�ش� ���� ������ �� ��ü
		LocalDate lastDayOfMonth = yearMonth.atEndOfMonth(); 
		
		int startWeek = 7; //�ش� ���� ù°��
		
		int lastDay = getLastDayOfMonth(year, month); //�ش� ���� ������ ��
		
        System.out.println("-------------------["+year+"�� "+month+"��]-------------------");
        System.out.println("��\t��\tȭ\t��\t��\t��\t��");
        
        //1�� ���� ���ϵ鿡�� ������ ä��� ���� ���ǹ�
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
            if (countDay % 7 == 0) { //�������� ������ ���� �ٷ� ���
                System.out.println();
            }
            countDay++;
        }
    }
	//�Է¹��� ���� �ش� ���� ������ ��¥ ���ϱ�
	private static int getLastDayOfMonth(int year, int month){//�޼ҵ� �������� Ÿ���� ����ؾ��� {
	    return YearMonth.of(year, month).lengthOfMonth();
	}
}
		

	
