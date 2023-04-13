package ru.gb.kamenev;

import com.sun.corba.se.impl.io.TypeMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    /*
    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение.
    Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
    необходимо повторно запросить у пользователя ввод данных.
     */
    public static void main(String[] args) {
        float res = task1();
        System.out.println(res);
    }

    public static float task1() {
        float usersNumber = 0;
            try {
                usersNumber = usersFloat();
                return usersNumber;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                return task1();
            }
    }

    public static float usersFloat(){
        float res;
        System.out.println("Введите число:");

        if (input.hasNextFloat()) {
            res = input.nextFloat();
        } else {
            input.nextLine();
            throw new InputMismatchException("Введено неверное значение");
        }

        return res;
    }
}