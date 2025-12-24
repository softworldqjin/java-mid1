package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args){
        String str = "Hello, Java! Welcome to Java";

        System.out.println("인덱스 12부터 문자열 뽑기: " +
                str.substring(13));
        System.out.println("인덱스 12부터 20 전까지 문자열 뽑기: " +
                str.substring(13, 20));

        System.out.println("문자열 결합: " + str.concat("!!!"));
        System.out.println("'Java를 'World'로 교체: " +
                str.replace("Java", "World"));
        System.out.println("첫 번째 'Java'를 'World'로 교체: " +
                str.replaceFirst("Java", "World"));

    }
}
