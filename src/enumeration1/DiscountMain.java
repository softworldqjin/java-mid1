package enumeration1;

public class DiscountMain {
    public static void main(String[] arg) {
        int price = 1000;

        DiscountService discountService = new DiscountService();
        int basicDiscount = discountService.discount(ClassGrade.BASIC, price);
        int goldDiscount = discountService.discount(ClassGrade.GOLD, price);
        int diamondDiscount = discountService.discount(ClassGrade.DIAMOND, price);

//        ClassGrade classGrade = new ClassGrade();

        System.out.println("basic 등급 할인금액: " + basicDiscount);
        System.out.println("goldPrice: " + goldDiscount);
        System.out.println("diamondPrice: " + diamondDiscount);

    }
}
