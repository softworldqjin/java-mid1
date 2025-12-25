package enumeration.ref;

public class DiscountMain {
    public static void main(String[] args){
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(ClassGrade.BASIC, 10000);
        int gold = discountService.discount(ClassGrade.GOLD, 10000);
        int diamond = discountService.discount(ClassGrade.DIAMOND, 10000);

        System.out.println("basic: " + basic);
        System.out.println("gold: " + gold);
        System.out.println("diamond: " + diamond);
    }
}
