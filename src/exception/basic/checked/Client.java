package exception.basic.checked;

public class Client {
    public void call() throws MycheckedException{ // 예외 메소드 밖으로 던지기

        throw new MycheckedException("ex"); // 예외 폭탄 터뜨림
    }
}
