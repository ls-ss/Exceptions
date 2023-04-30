/*
Задача 2. Если необходимо, исправьте данный код
https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit
 */
public class hw2_2 {
    public static void main(String[] args) {

        int[] intArray = { 1, 2, 3, 4, 6, 7, 8, 9 };

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Арифметическое исключение: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Массив вышел за границы: " + e);
        } catch (NullPointerException e) {
            System.out.println("Nulls не допускается: " + e);
        }

    }
}
