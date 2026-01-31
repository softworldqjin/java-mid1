package lang.wrapper.test2;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.5", "4.5"};

        double sum = 0;
        for (String s : array) {
            sum += Double.parseDouble(s);
        }
        System.out.println("모든 합: " + sum);

    }
}
