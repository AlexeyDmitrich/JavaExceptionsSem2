package ru.gb.kamenev;

import java.util.Random;

public class Task2 {
    /*
     Если необходимо, исправьте данный код
     */

    // для наглядности создадим метод, где этот код будет выполняться

    /**
     * в этот метод завернут код из задачи
     * @param intArray на вход подается массив целых чисел
     * @return возвращается девятое значение из массива, делённое на 0
     */
    public static double catchedRes (int[] intArray) {
        double catchedRes1 = 0;
        try {
            int d = 0;
            catchedRes1 = (float) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("Array size exception: %s\n", e.getMessage());    // перед проверкой деления на 0 стоит проверить попадание размера массива
        } catch (ArithmeticException e) {   // не каждый компилятор обрадуется делению на 0, поэтому данная ситуация обрабатывается по дефолту
            System.out.println("Catching exception: " + e);
        } catch (RuntimeException e) {      // мало ли, что ещё возникнет при обработке этого массива
            System.out.printf("Возникло странное исключение: %s", e.getMessage());
        }
        return catchedRes1;
    }

    static Random rnd = new Random();

    /**
     * для проверки метода в действии создадим для него массив
     * @return вернем его результат
     */
    public static double takeByArr() {
        int[] intArr = new int[rnd.nextInt(13 - 8) + 8];  // создаем массив длинной от 8 до 12, для вероятности исключения по длине
        System.out.printf("Создан массив длиной %d\n", intArr.length);
        for (int i = 0; i < rnd.nextInt(intArr.length-5)+5; i++) {  // добавляем вероятность незаполнения 8 ячейки
            intArr[i] = rnd.nextInt(11+10)-10;  // для заполнения возьмем числа от -10 до 10
        }
        if (intArr.length>8) {
            System.out.printf("В ячейке [8] лежит значение %d\n", intArr[8]);
        }
        double res = catchedRes(intArr);    // применяем метод
        return res;
    }

    // теперь этот метод можно вызвать
    public static void main(String[] args) {
        System.out.println(takeByArr());
    }
}
