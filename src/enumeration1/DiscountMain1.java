package enumeration1;

import java.util.Arrays;

public class DiscountMain1 {
    public static void main(String[] args) {
        int price = 10000;

        ClassGrade1[] classGrade1s = ClassGrade1.values();
        for (ClassGrade1 c : classGrade1s) {
            printDiscount(c, price);
        }
    }

    static void printDiscount(ClassGrade1 classGrade1, int price) {
        System.out.println(classGrade1.name() + "등급의 할인 금액: " + classGrade1.discount(price));
    }
}

//        ClassGrade1[] values = ClassGrade1.values();
//        System.out.println(Arrays.toString(values));
//        System.out.println();
//
//        for (ClassGrade1 v : values) {
//            System.out.println(v.name() + ", " + v.ordinal());
//
//        }
//        System.out.println();
//        String input = "DIAMOND";
//        ClassGrade1 classGrade1 = ClassGrade1.valueOf(input);
//        System.out.println(classGrade1);
//    }
