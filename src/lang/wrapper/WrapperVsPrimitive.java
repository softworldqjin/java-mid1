package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args){
        long longValue = 1_000_000_000L;
        Long l = 0L;
        Long startTime = System.currentTimeMillis();

        for (long i = 0; i < longValue; i++){
            l += 1;
        }
        long lastTime = System.currentTimeMillis();

        System.out.println(l);
        System.out.println(lastTime - startTime);
    }
}
