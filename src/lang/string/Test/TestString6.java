package lang.string.Test;

public class TestString6 {
    public static void main(String[] args){
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        // 찾은 문자의 개수 indexOf
        //int start =  str.indexOf(key) 나오면 str.indexOf(key, start)

        int from = 0;
        int count = 0;
        while (true){
            from = str.indexOf(key, from+1);
            if (from == -1){
                break;
            }
            count++;
        }
        System.out.println("count = " + count);
    }
}
