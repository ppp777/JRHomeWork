package com.javarush.test.level04.lesson16.home04;

import java.util.Scanner;

/*
 Ввести с клавиатуры строку name.
 Ввести с клавиатуры дату рождения (три числа): y, m, d.
 Вывести на экран текст:
 «Меня зовут name
 Я родился d.m.y»
 Пример:
 Меня зовут Вася
 Я родился 15.2.1988
 */
public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int y  = Integer.parseInt(s.nextLine());
        int m  = Integer.parseInt(s.nextLine());
        int d  = Integer.parseInt(s.nextLine());
        System.out.println("Меня зовут " + s1);
        System.out.println("Я родился " + d + "." + m + "." + y);

    }
}
