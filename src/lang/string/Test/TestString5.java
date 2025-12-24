package lang.string.Test;

public class TestString5 {
    public static void main(String[] args){
        String str = "hello.txt";
        String ext = ".txt";

        // indexOf substring

        int index1 = str.indexOf(ext);
        String str1 = str.substring(0,index1);
        String str2 = str.substring(index1);

        System.out.println("filename: " + str1);
        System.out.println("extName: " + str2);
    }
}
