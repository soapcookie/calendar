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
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                    break;
            }
        } while (!option.equals("q"));
    }

    private static void printMenu() {
        System.out.println("=== 일정 관리 프로그램 ===");
        System.out.println("1. 일정 등록");
        System.out.println("2. 일정 검색 및 변경");
        System.out.println("3. 일정 삭제");
        System.out.println("h. 도움말");
        System.out.println("q. 종료");
        System.out.print("메뉴를 선택하세요: ");
    }
    private static void register(Scanner scanner) {
        System.out.print("일정을 입력하세요: ");
        String schedule = scanner.nextLine();

        calendarFrame.addSchedule(schedule);
        System.out.println("일정이 등록되었습니다.");
    }

    private static void update(Scanner scanner) {
        System.out.print("검색할 일정을 입력하세요: ");
        String scheduleToSearch = scanner.nextLine();

        String foundSchedule = calendarFrame.findSchedule(scheduleToSearch);
        if (foundSchedule != null) {
            System.out.println("일정을 찾았습니다: " + foundSchedule);

            System.out.print("변경할 일정을 입력하세요 (변경하지 않으려면 엔터키를 입력): ");
            String updatedSchedule = scanner.nextLine();

            if (!updatedSchedule.isEmpty()) {
                calendarFrame.update(foundSchedule, updatedSchedule);
                System.out.println("일정이 변경되었습니다.");
            }
        } else {
            System.out.println("일정을 찾을 수 없습니다.");
        }
    }

    private static void delete(Scanner scanner) {
        System.out.print("삭제할 일정을 입력하세요: ");
        String scheduleToDelete = scanner.nextLine();

        boolean deleted = calendarFrame.delete(scheduleToDelete);
        if (deleted) {
            System.out.println("일정이 삭제되었습니다.");
        } else {
            System.out.println("일정을 찾을 수 없습니다.");
        }
    }

    private static void help() {
        System.out.println("도움말: 해당 프로그램은 일정을 등록, 검색/변경, 삭제할 수 있는 기능을 제공합니다.");
        // 도움말 내용 추가
    }
}
