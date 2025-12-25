package enumeration.ex1;

public class DiscountMain {
    public static void main(String[] args){
        DiscountService discount = new DiscountService();
        int basic = discount.discount(StringGrade.BASIC, 10000);;
        int gold = discount.discount(StringGrade.GOLD, 10000);;
        int diamond = discount.discount(StringGrade.DIAMOND, 10000);;

        System.out.println("basic 등급 할인: " + basic);
        System.out.println("gold 등급 할인: " + gold);
        System.out.println("diamond 등급 할인: " + diamond);

    }
}
