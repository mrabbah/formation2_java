package com.example.java;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.*;

public class Main {

    private static final String FLOWERS_FEED =
            "https://services.hanselandpetal.com/feeds/flowers.xml";

    public static void main(String[] args) throws IOException {

       try {
            URL url = new URL(FLOWERS_FEED);

            try (InputStream stream = url.openStream();
                 BufferedInputStream buf = new BufferedInputStream(stream);) {

                StringBuilder sb = new StringBuilder();

                while (true) {
                    int data = buf.read();
                    if(data == -1) {
                        break;
                    } else {
                        sb.append((char) data);
                    }
                }

                Path targetFile = Paths.get("files", "flowers.xml");
                try {
                    Files.write(targetFile, sb.toString().getBytes(), StandardOpenOption.CREATE_NEW);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(sb);

            } catch(Exception e) {
                e.printStackTrace();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

}
