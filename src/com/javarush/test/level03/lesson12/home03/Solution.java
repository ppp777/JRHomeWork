package com.javarush.test.level03.lesson12.home03;

import java.util.Scanner;

/*
 Ввести с клавиатуры число n.
 Вывести на экран надпись «Я буду зарабатывать $n в час».
 Пример:
 Я буду зарабатывать $50 в час
 */
public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        System.out.println("Я буду зарабатывать $" + s1 + " в час");
    }
}