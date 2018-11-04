package Homework2;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[][] goodarray = {
                {"11", "12", "13", "14"},
                {"21", "22", "23", "24"},
                {"31", "32", "33", "34"},
                {"41", "42", "43", "44"}
        };
        String[][] wrongdim = {
                {"11", "12", "13", "14"},
                {"21", "22"},
                {"31", "32", "33", "34"},
                {"41", "42", "43", "44"}
        };
        String[][] wrongsymbol = {
                {"11", "12", "13", "14"},
                {"21", "22", "23", "24"},
                {"31", "sss", "32", "34"},
                {"41", "42", "43", "44"}
        };

        try{
            ArrayMethod(wrongsymbol);
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }

    }


    public static void ArrayMethod(String[][] Arr) throws MyArraySizeException, MyArrayDataException{

        int sum = 0;

        if (4 != Arr.length) throw new MyArraySizeException();

        for (int i = 0; i < Arr.length; i++) {
            if (4 != Arr[i].length) throw new MyArraySizeException();
            for (int k = 0; k < Arr[i].length; k++) {

                try {
                    sum += Integer.parseInt(Arr[i][k]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, k);
                }
            }
        }

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
