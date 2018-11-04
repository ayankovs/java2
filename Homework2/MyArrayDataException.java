package Homework2;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int row, int col) {
        super(String.format("В ячейки [%d, %d] неправильный формат данных", row, col));
    }
}