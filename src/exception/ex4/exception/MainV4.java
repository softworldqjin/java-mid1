package exception.ex4.exception;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
//        NetworkServiceV1_1 networkServiceV0 = new NetworkServiceV1_1();
//        NetworkServiceV1_2 networkService = new NetworkServiceV1_2();

        NetworkServiceV5 networkService = new NetworkServiceV5();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            String message = scanner.nextLine();

            if ("exit".equals(message)) {
                break;
            }
            try {
                networkService.sendMessage(message);
            } catch (Exception e) {
                exceptionHandler(e);
            }
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    private static void exceptionHandler(Exception e) {
        System.out.println("죄송합니다, 알 수 없는 문제가 발생했습니다.");
        System.out.println("==개발자용 디버깅 메시지==");
        e.printStackTrace(System.out);
//        e.printStackTrace();

        if (e instanceof SendExceptionV4 sendExceptionV4) {
            System.out.println("오류 전송 데이터: " + sendExceptionV4.getSendData());
        }

    }
}
