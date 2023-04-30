/*
Задача 4. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих
массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */
public class hw1_4 {
    public static void main(String[] args) {

        int[] arr11 = { 1, 2, 3, 4, 5 };
        int[] arr21 = { 5, 4, 3, 2, 0 };
        divArrays(arr11, arr21);

        int[] arr12 = { 1, 2, 3, 4, 5 };
        int[] arr22 = { 5, 4, 3, 2, 0, 6 };
        divArrays(arr12, arr22);

        int[] arr23 = { 5, 4, 3, 2, 0, 6 };
        divArrays(null, arr23);
    }

    public static double[] divArrays(int[] numArr1, int[] numArr2) {
        if (numArr1 == null || numArr2 == null) {
            throw new RuntimeException("Массив равен Null.");
        }
        if (numArr1.length != numArr2.length) {
            throw new RuntimeException("Размеры массивов не совпадают.");
        }
        double[] result = new double[numArr1.length];
        for (int i = 0; i < result.length; i++) {
            if (numArr2[i] == 0) {
                throw new RuntimeException(String.format("Деление на 0.", i));
            }
            result[i] = numArr1[i] / numArr2[i];
        }
        return result;
    }
}