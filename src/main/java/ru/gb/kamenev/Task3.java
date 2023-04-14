package ru.gb.kamenev;

public class Task3 {
    /*
Дан следующий код, исправьте его там, где требуется
     */
    public static void main(String[] args) /*throws Exception*/ {   // точка входа. из неё прбрасывать дальше уже некуда.
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        }

        /*
        В следующем блоке всё нормально, просто не в том порядке. Так будет лучше:
         */
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        }
        catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }

    }
    public static void printSum(Integer a, Integer b) /*throws FileNotFoundException*/ { // тоже неясно, какой тип исключений и зачем пробрасывается наверх
        System.out.println(a + b);
    }

}
