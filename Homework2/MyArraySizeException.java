package Homework2;

public class MyArraySizeException extends Exception {

    public MyArraySizeException() {
        super("Размерность массива должна быть 4 на 4");
    }
}