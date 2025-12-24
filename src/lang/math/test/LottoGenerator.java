package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final String[] lottoArray;
    private int[] preLottoArray;
    private int count;

    public LottoGenerator(){
        Random random = new Random();

        lottoArray = new String[6];
        preLottoArray = new int[6];

        for (int i = 0; i < lottoArray.length; i++){
            int num = random.nextInt(45)  + 1;

            if (count == 0){
                lottoArray[i] = String.valueOf(num);
                preLottoArray[i] = num;
            } else {
                for (int j = 0; j < count; j++){
                    while (true){
                        if (preLottoArray[j] == num){
                            num = random.nextInt(45) + 1;
                        } else {
                            preLottoArray[i] = num;
                            break;
                        }
                    }
            }
            } count++;
        }
        for (int k = 0; k < lottoArray.length; k++){
            lottoArray[k] = String.valueOf(preLottoArray[k]);
        }
    }

    public void lottoPrint(){
        System.out.println(String.join(" ", lottoArray));
    }
}
