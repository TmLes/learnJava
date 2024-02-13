package com.walking.lesson1;
/*
Базовая структура программы, переменные, типы данных и все-все-все
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        dataTypes();
    }

    private static void dataTypes() {
        boolean isActive = true; // true or false
        byte byteNumber = 1;  // хранит целое число от -128 до 127 и занимает 1 байт
        short shortNumber = 256;  // short: хранит целое число от -32768 до 32767 и занимает 2 байта
        int intNumber = 60589;  // хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
        long longNumber = 568497234L;  //  хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт

        double doubleNumber = 0.65874964525;  // хранит число с плавающей точкой от ±4.9*10-324 до ±1.7976931348623157*10308 и занимает 8 байт
        float floatNumber = 0.001F;  // хранит число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта

        var ch = 'A';  // хранит одиночный символ в кодировке UTF-16 и занимает 2 байта, поэтому диапазон хранимых значений от 0 до 65535
        char ch1 = 102; // символ 'f'
        char ch3 = '\u0066';  // символ 'f'

        int num111 = 0x6F; // 16-теричная система, число 111
        var num8 = 010; // 8-ричная система, число 8
        var num13 = 0b1101; // 2-ичная система, число 13

        var name = "John";
        final String SONG = """
                If you want to be OK
                Kiss my penis everyday!
                """;
        System.out.printf("%b%n%d%n%d%n%d%n%d%n%f%n%f%n%c%n%c%n%c%n%d%n%d%n%d%n%s%n%s%n",isActive, byteNumber, shortNumber, intNumber, longNumber, doubleNumber, floatNumber, ch, ch1, ch3, num111, num8, num13, name, SONG);
    }
}
