package exception.ex1;

public class NetworkServiceV1_3 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data);
        String connectedResult = client.connect();
        if (isError(connectedResult)) {
            System.out.println("오류 코드 " + connectedResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("오류 코드 " + sendResult);
            }
        }

        client.disconnect();
    }

    private static boolean isError(String result) {
        return !"success".equals(result);
    }
}
