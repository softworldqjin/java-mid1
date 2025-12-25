package enumeration.ex2;

public class DiscountService {

    public int discount(ClassGrade grade, int price){
        double discountRate = 0;
        if (ClassGrade.BASIC == grade){
            discountRate = 0.1;
        } else if (ClassGrade.GOLD == grade){
            discountRate = 0.2;
        } else if (ClassGrade.DIAMOND == grade){
            discountRate = 0.3;
        } else {
            System.out.println("할인 불가능");
        }
        return (int) (price * discountRate);
    }
}
