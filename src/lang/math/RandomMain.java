package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args){
        Random random = new Random(1);
//        Random random = new Random();

        int randomInt = random.nextInt();
        System.out.println(randomInt);

        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println(randomBoolean);

        // 범위조회
        int randomRange = random.nextInt(0,10); // 9까지
        System.out.println(randomRange);

        int randomReal = random.nextInt(10) + 1;
        System.out.println(randomReal);
    }
}
