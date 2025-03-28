package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCCalendarPrinter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        printCalender(year, month);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        LocalDate firstDayofMonth = LocalDate.of(year, month, 1);
        int value = firstDayofMonth.getDayOfWeek().getValue();

    }

    private static void printCalender(int year, int month) {
        LocalDate firstDayofMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayofMonth.plusMonths(1);

        //월요일=1(1%7=1) ... 일요일 = 7(7%7=0)
        int offsetWeekDays = firstDayofMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa ");

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayofMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());

            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }

            dayIterator = dayIterator.plusDays(1);

        }


    }
}
