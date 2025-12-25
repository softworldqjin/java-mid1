package enumeration.ref;

public class DiscountService {
    public int discount(ClassGrade grade, int price){
        return grade.getDiscountRate() * price / 100;
    }
}
