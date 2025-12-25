package enumeration.test;
import static enumeration.test.AuthGrade.*;

public class AuthMain {
    public static void main(String[] args){

        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade a : authGrades){
            printInfo(a);
        }
    }
    private static void printInfo(AuthGrade authGrade){
        System.out.println("grade=" + authGrade.name() + ", level=" + authGrade.getLevel()
        + ", 설명=" + authGrade.getDescription());
    }
}
