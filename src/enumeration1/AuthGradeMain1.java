package enumeration1;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade a : authGrades) {
            System.out.println("grade=" + a.name() + ", level=" + a.getLevel() + ", 설명=" + a.getDescription());
        }
    }
}
