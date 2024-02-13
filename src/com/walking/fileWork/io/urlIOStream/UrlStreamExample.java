package com.walking.fileWork.io.urlIOStream;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;



public class UrlStreamExample {
    public static void main(String[] args) {
        try {
            InputStream is = new URL("https://dzen.ru/?yredirect=true").openStream();
            System.out.printf(new String(is.readAllBytes()), StandardCharsets.UTF_8);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
