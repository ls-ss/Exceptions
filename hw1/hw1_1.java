/*
Задача 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
 */
public class hw1_1 {
    public static void main(String[] args) {
        ExceptionsMethods Exceptions = new ExceptionsMethods();

        Exceptions.ExceptionStackOverflow(1); // рекурсия без правильного выхода,уходящая в бесконечность
        Exceptions.ArrayStoreException(); // создали массив объектов строки, а пытаемся добавить числа
        Exceptions.NegativeArraySizeException(-5); // пробуем создать массив с отрицательным количеством элементов
    }
}

class ExceptionsMethods {
    public void ExceptionStackOverflow(int counter) {
        if (counter == 0)
            return;
        else
            ExceptionStackOverflow(++counter);
    }

    public void ArrayStoreException() {
        Object[] x = new String[3];
        x[0] = "data";
        System.out.println(x[0]);
        x[0] = 55;
        System.out.println(x[0]);
    }

    public void NegativeArraySizeException(int size) {
        int[] array = new int[size];
    }
}