package org.zerock;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
//bad code
    public static void main(String[] args) throws IOException {
        String path = "https://postfiles.pstatic.net/MjAyMjAzMDFfMTYw/MDAxNjQ2MTM1MDI0MDY4.hu6Jxw4EPvIxPvvasikYO2SkN8O_bke4JGtRyObtUssg.Eh1YpYtZqAtLfuFSSxuTP9D9YPNlYjbhd99_CRaidFMg.JPEG.riva8013/665046641.889784.jpg?type=w966";
        InputStream input = new URL(path).openStream();
        System.out.println(input);

        OutputStream outputStream = new FileOutputStream("C:\\zzz\\test.jpg");

        while (true){

            int data = input.read();
            if (data==-1){
                break;
            }
            outputStream.write(data);
        }

    }
}
