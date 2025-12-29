package time.test;

import java.time.LocalDate;
import java.util.Scanner;

public class Calender {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        System.out.println();
    }
    private static void printCalender(int year, int month){
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
//        LocalDate first
    }
}
