package enumeration.ex3;
import static enumeration.ex3.Grade.*;

public class DiscountService {
    public int discount(Grade grade, int price){
        double discountRate = 0;
        if (BASIC == grade){
            discountRate = 0.1;
        } else if (GOLD == grade){
            discountRate = 0.2;
        } else if (DIAMOND == grade){
            discountRate = 0.3;
        } else {
            System.out.println("할인 없음");
        }
        return (int) (discountRate * price);
    }
}
