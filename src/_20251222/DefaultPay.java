package _20251222;

public class DefaultPay implements Pay{
    @Override
    public boolean pay(int amount){
        System.out.println("결제 수단이 없습니다.");
        System.out.println("결제가 실패했습니다.");
        return false;
    }

    @Override
    public String getName(){
        return "default";
    }
}
