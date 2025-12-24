package lang.string.bulider;

public class LoopStringBuilderMain {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 100000; i++){
            stringBuilder.append("Hello Java ");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("result: "  + stringBuilder);
        System.out.println(endTime - startTime);
    }
}
