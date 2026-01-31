package exception.ex0;

import java.util.Scanner;

public class MainV0 {
    public static void main(String[] args) {
        NetworkServiceV0 networkServiceV0 = new NetworkServiceV0();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            String message = scanner.nextLine();

            if ("exit".equals(message)) {
                break;
            }
            networkServiceV0.sendMessage(message);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
