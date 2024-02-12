package com.walking.fileWork.io.byteArrayIOStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * классы для чтения/записи в массив байтов
 * одна из реализаций InputStream
 */
public class byteArrayIO {
    public static void main(String[] args) {
        String msg = "Hello, World";

        readByteArray(msg);
        System.out.println(writeByteArray(msg));
    }

    /**
     * Метод читает массив байт из строки
     * @param msg текст который нужно перевести в массив
     */
    private static void readByteArray(String msg) {
        byte[] array = msg.getBytes();  // создаем массив байт из строки
        ByteArrayInputStream bais = new ByteArrayInputStream(array);
        int data;
        while((data = bais.read()) != -1) { // -1 это конец массива
            System.out.println((char) data);  // приводим к char
        }
    }

    /**
     * Метод записывает переданный текст в массив байт
     * @param msg текст для записи
     * @return строку
     */
    private static String writeByteArray(String msg) {
        int length = msg.length();
        ByteArrayOutputStream baos = new ByteArrayOutputStream(length);
        byte[] array = msg.getBytes();
        try {
            baos.write(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return baos.toString();
    }
}
