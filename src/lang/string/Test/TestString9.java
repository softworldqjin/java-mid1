package lang.string.Test;

public class TestString9 {
    public static void main(String[] args){
        String email = "hello@example.com";
        String[] strings = email.split("@");

        String ID = strings[0];
        String Domain = strings[1];

        System.out.println("ID: " + ID);
        System.out.println("Domain: " + Domain);
    }
}
