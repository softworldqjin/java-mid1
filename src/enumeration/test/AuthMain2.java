package enumeration.test;
import java.util.Scanner;
import static enumeration.test.AuthGrade2.*;

public class AuthMain2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String result = null;
        String[] menus = {"메인화면", "이메일 관리 화면", "관리자 화면"};

        while (true){
            System.out.print("당신의 등급 입력[GUEST, LOGIN, ADMIN]: ");
            String option = scanner.nextLine();
            AuthGrade2 a = AuthGrade2.valueOf(option);

            System.out.println("당신의 등급은 " + a.name() + "입니다");
            System.out.println("==메뉴 목록==");
            for (int i = 0; i < a.getCount(); i++){
                System.out.println("- " + menus[i]);
            }
        }

    }
}
