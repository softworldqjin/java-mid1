package lang.wrapper.test2;
import java.util.Random;

public class LottoGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lotto = new int[6];
        lotto[0] = random.nextInt(45)+1;

        for (int i = 1; i < 6; i++) {
            lotto[i] = random.nextInt(45)+1;

            for (int j = 0; j < i; j++) {
                if (lotto[j] == lotto[i]) {
                    i--;
                    break;
                }
            }
        }
        System.out.print("로또 번호: ");
        for (int i = 0; i < lotto.length; i++) {
            System.out.printf("%d ", lotto[i]);
        }
    }
}
