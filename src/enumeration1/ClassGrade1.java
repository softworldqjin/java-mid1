package enumeration1;

public enum ClassGrade1 {
    BASIC(10), GOLD(20), DIAMOND(30), ROLLL(40);

    private final int discount;

    ClassGrade1(int discount) {
        this.discount = discount;
    }

    private int getDiscount() {
        return discount;
    }

    public int discount(int price){
        return price * discount / 100;
    }
}
