package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args){
        String str = "Hello, Java! Welcome to Java";

        System.out.println("문자열에 'Java'가 포함되어 있는지: " +
                str.contains("Java"));
        System.out.println("'Java'가 나오는 첫 번째 인덱스: " +
                str.indexOf("Java"));
        System.out.println("인덱스 8뒤에있는 'Java'의 인덱스: " +
                str.indexOf("Java", 8));
        System.out.println("'Java'의 마지막 인덱스: " +
                str.lastIndexOf("Java"));
    }
}
