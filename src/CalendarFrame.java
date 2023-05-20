import java.util.Calendar; //�޷� ���鶧 ������
public class CalendarFrame {
	public void Calendar(int year, int month) {
		
		
		//�޷� ��� �κ�
		Calendar calendar = Calendar.getInstance();	//���� ��¥�� �ð��� �������� �޼ҵ�, �ν��Ͻ� ���� ����
		calendar.set(year, month - 1, 1);//�ڹ� Ŭ�������� ���� 0���� �����ϹǷ� 1�� ���ֱ�

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
