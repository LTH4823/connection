package org.zerock;

import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TestClient {

    //bad code
    public static void main(String[] args)throws Exception {
        Socket socket = new Socket("192.168.0.86",5555);

        System.out.println(socket);

        InputStream input = socket.getInputStream();

        byte[] buffer = new byte[100];



//        int data = input.read(buffer);
//        이유 처음 값을 읽고 들어 갈때 바이트 범위가 적용 된 후 cout쪽에 다시 적용 시키려 했기떄문 이때 공간이 부족하여 글이 깨지거나 오류 발생
        int count = input.read(buffer);


        System.out.println("COUNT: "+ count);

        String str = new String(buffer, StandardCharsets.UTF_8);

        System.out.println(str);

    }
}
