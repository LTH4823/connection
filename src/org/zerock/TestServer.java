package org.zerock;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TestServer {

    //bad code
    public static void main(String[] args)throws Exception {
        System.out.println("Start server....................................");
        ServerSocket serverSocket = new ServerSocket(5555);
        System.out.println("Server run.................");

        for (int i = 0; i < 100; i++) {
            System.out.println("wait client....................");
            Socket socket = serverSocket.accept();
            System.out.println(socket);

            OutputStream out = socket.getOutputStream();
            String str = "순대국";

            byte[] arr = str.getBytes(StandardCharsets.UTF_8);

            out.write(arr);
        }
    }
}
