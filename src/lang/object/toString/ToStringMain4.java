package lang.object.toString;

public class ToStringMain4 {
    public static void main(String[] args){
        Object object = new Object();
        String string = object.toString();

        // toString() 반환값,, java.lang.해당클래스(로 만들어짐)@참조값
        System.out.println(string);

        // object 직접 출력
        System.out.println(object);
    }
}
