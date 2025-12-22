package _20251222;

public class PayService {
    private static final Pay[] pay = {
            new NaverPay(),
            new KakaoPay(),
            new NewPay()
    };

    public void processPay(String option, int amount){
        System.out.println("결제 시작: option = " + option + ", amount = " + amount);

        Pay pay = selectPay(option);
        if (pay.pay(amount)){
            System.out.println("결제 성공");
        } else {
            System.out.println("결제 실패");
        }
    }

    private Pay selectPay(String option){
        for (Pay pay1 : pay) {
            if (pay1.getName().equals(option)){
                return pay1;
            }
        }
        return (new DefaultPay());
    }
}

