package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args){
        System.out.println(Grade.BASIC.getClass());

        System.out.println(Grade.BASIC.toString());
        System.out.println(print(Grade.BASIC));

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, 10000);
        int gold = discountService.discount(Grade.GOLD, 10000);
        int diamond = discountService.discount(Grade.DIAMOND, 10000);


        System.out.println("basic 할인금액: " + basic);
        System.out.println("gold 할인금액: " + gold);
        System.out.println("diamond 할인금액: " + diamond);
    }
    public static String print(Grade grade){
        return  Integer.toHexString(System.identityHashCode(grade));
    }
}
