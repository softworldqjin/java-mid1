package enumeration.ref2;
import static enumeration.ref2.ClassGrade.*;

public class DiscountMain {
    public static void main(String[] args){
        int price = 10000;
        ClassGrade[] classGrades = ClassGrade.values();
        for (ClassGrade grade : classGrades){
            printDiscount(grade, price);
        }

        }
    private static void printDiscount(ClassGrade grade, int price){
        System.out.println(grade.discount(price));
    }
}
