package _20251222;

public class NewPay implements Pay{
    @Override
    public boolean pay(int amount){
        System.out.println("새로운페이와 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }

    @Override
    public String getName(){
        return "new";
    }
}
