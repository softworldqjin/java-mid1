package enumeration1;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String grade = input.next();
        AuthGrade authGrade = AuthGrade.valueOf(grade);

        System.out.println("당신의 등급은 " + authGrade.name() + "입니다.");
        if (AuthGrade.GUEST == authGrade) {

        }
    }
}
