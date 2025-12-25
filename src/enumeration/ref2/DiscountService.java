package enumeration.ref2;

public class DiscountService {
    public int discount(ClassGrade grade, int price){
        return grade.discount(price);
    }
}
