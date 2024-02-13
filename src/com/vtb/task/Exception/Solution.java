package com.vtb.task.Exception;

class MyArraySizeException extends RuntimeException {
}

class MyArrayDataException extends RuntimeException {
    int row;
    int column;
    String value;

    public MyArrayDataException() {
    }

    public MyArrayDataException(int row, int column, String[][] array) {
        super("Invalid data in [" + row + ";" + column + "] " + array[row][column]);
        this.row = row;
        this.column = column;
        this.value = array[row][column];
    }
}

public class Solution {
    static int adding(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int goodLength = 4;
        int sum = 0;

        if (array.length != goodLength) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != goodLength) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] myArray = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8",},
                {"9", "s", "11", "12"},
                {"13", "14", "15", "16"},};
        try {
            System.out.println(adding(myArray));
        } catch (MyArraySizeException e) {
            System.out.println("Invalid size of array");
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
