package enumeration.ref2;

public enum ClassGrade {
    BASIC(10), GOLD(20), DIAMOND(30), VIP(40);
    private final int discountRate;

    ClassGrade(int discountRate){
        this.discountRate = discountRate;
    }

    public int getDiscountRate(){
        return discountRate;
    }

    public int discount(int price){
        return discountRate * price / 100;
    }

}
