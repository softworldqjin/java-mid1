package enumeration.ex1;

public class DiscountService {
    private double discountRate;

    public int discount(String grade, int price){
        if (StringGrade.BASIC.equals(grade)){
            discountRate = 0.1;
        } else if (StringGrade.GOLD.equals(grade)){
            discountRate = 0.2;
        } else if (StringGrade.DIAMOND.equals(grade)){
            discountRate = 0.3;
        } else {
            System.out.println("할인 불가");
        }
        return (int) (price * discountRate);
    }
}
