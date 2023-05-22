import java.util.Scanner;

public class CalendarInput {
    private static CalendarFrame calendarFrame = new CalendarFrame();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option;

        do {
            printMenu();
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    register(scanner);
                    break;
                case "2":
                    update(scanner);
                    break;
                case "3":
                    delete(scanner);
                    break;
                case "h":
                    help();
                    break;
                case "q":
                    System.out.println("���α׷��� �����մϴ�.");
                    break;
                default:
                    System.out.println("�߸��� �Է��Դϴ�. �ٽ� �õ����ּ���.");
                    break;
            }
        } while (!option.equals("q"));
    }

    private static void printMenu() {
        System.out.println("=== ���� ���� ���α׷� ===");
        System.out.println("1. ���� ���");
        System.out.println("2. ���� �˻� �� ����");
        System.out.println("3. ���� ����");
        System.out.println("h. ����");
        System.out.println("q. ����");
        System.out.print("�޴��� �����ϼ���: ");
    }
    private static void register(Scanner scanner) {
        System.out.print("������ �Է��ϼ���: ");
        String schedule = scanner.nextLine();

        calendarFrame.addSchedule(schedule);
        System.out.println("������ ��ϵǾ����ϴ�.");
    }

    private static void update(Scanner scanner) {
        System.out.print("�˻��� ������ �Է��ϼ���: ");
        String scheduleToSearch = scanner.nextLine();

        String foundSchedule = calendarFrame.findSchedule(scheduleToSearch);
        if (foundSchedule != null) {
            System.out.println("������ ã�ҽ��ϴ�: " + foundSchedule);

            System.out.print("������ ������ �Է��ϼ��� (�������� �������� ����Ű�� �Է�): ");
            String updatedSchedule = scanner.nextLine();

            if (!updatedSchedule.isEmpty()) {
                calendarFrame.update(foundSchedule, updatedSchedule);
                System.out.println("������ ����Ǿ����ϴ�.");
            }
        } else {
            System.out.println("������ ã�� �� �����ϴ�.");
        }
    }

    private static void delete(Scanner scanner) {
        System.out.print("������ ������ �Է��ϼ���: ");
        String scheduleToDelete = scanner.nextLine();

        boolean deleted = calendarFrame.delete(scheduleToDelete);
        if (deleted) {
            System.out.println("������ �����Ǿ����ϴ�.");
        } else {
            System.out.println("������ ã�� �� �����ϴ�.");
        }
    }

    private static void help() {
        System.out.println("����: �ش� ���α׷��� ������ ���, �˻�/����, ������ �� �ִ� ����� �����մϴ�.");
        // ���� ���� �߰�
    }
}
