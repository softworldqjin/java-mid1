package enumeration.ex0;

public class DiscountMain {
    public static void main(String[] args){
        DiscountService discountService = new DiscountService();
        int price = 10000;

        int basic = discountService.getDiscountPrice("BASIC", price);
        int gold = discountService.getDiscountPrice("GOLD", price);
        int diamond = discountService.getDiscountPrice("DIAMOND", price);
        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);

    }
}
