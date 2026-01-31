package exception.basic.checked;

public class Service {
    Client client = new Client();

    public void callCatch() {
        try {
            client.call(); // throw new MycheckedException("ex")
        } catch (MycheckedException e) { // MycheckedException e = new MycheckedException("ex")
            System.out.println("예외 처리, message= " + e.getMessage());
        }
        System.out.println("정상흐름");
    }

    public void callThrow() throws MycheckedException{
        client.call();
    }
}
