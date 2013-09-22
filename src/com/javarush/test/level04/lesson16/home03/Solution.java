package com.javarush.test.level04.lesson16.home03;

import java.util.Scanner;

/*
 Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
 */
public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int a = 0;
        int sum = 0;
        while (a != -1){
             a = Integer.parseInt(s.nextLine());
             // if (a != -1)
                 sum = sum + a;
        }
        System.out.println(sum);
    }
}
