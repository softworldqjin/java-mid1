package enumeration.ex0;

public class DiscountService {
    private double discountRate;

    public int getDiscountPrice(String grade, int price){
        if ("BASIC".equals(grade)){
            discountRate = 0.1;
        } else if ("GOLD".equals(grade)){
            discountRate = 0.2;
        } else if ("DIAMOND".equals(grade)){
            discountRate = 0.3;
        } else {
            System.out.println("할인없음");
        }
        return (int) (discountRate * price);
    }
}
