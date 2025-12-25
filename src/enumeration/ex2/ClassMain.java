package enumeration.ex2;

public class ClassMain {
    public static void main(String[] args){
        System.out.println("class basic: " + ClassGrade.BASIC.getClass());
        System.out.println("class gold: " + ClassGrade.GOLD.getClass());
        System.out.println("class diamond: " + ClassGrade.DIAMOND.getClass());

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC, 10000);
        int gold = discountService.discount(ClassGrade.GOLD, 10000);
        int diamond = discountService.discount(ClassGrade.DIAMOND, 10000);

        System.out.println("basic 할인금액: " + basic);
        System.out.println("gold 할인금액: " + gold);
        System.out.println("diamond 할인금액: " + diamond);

    }
}
