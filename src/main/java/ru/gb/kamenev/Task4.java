package ru.gb.kamenev;

import java.util.Objects;
import java.util.Scanner;

public class Task4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(put());
    }

    /*
    Максимум, что получилось поймать - это ввод полностью пустой строки, если он первый.
    При этом адекватный ввод будет прочитан только из 2 строки.
     */
    public static String put(){
        System.out.println("Введите значение:");

        if (input.nextLine().isEmpty()){
            throw new RuntimeException("Недопустим ввод пустой строки");
        }
        String put = input.next();
        return put;
    }
}
