package com.javarush.test.level17.lesson10.home02;

import java.util.TreeSet;

public class Solution
{
    public static void main (String[] args){

//        Давай так: у тебя есть 5 разных пляжей. Ты хочешь их как-то упорядочить. Для этого используешь метод compareTo().
//        1.Как сейчас твой код упорядочит 5 пляжей?
//        2. Для 5 сортировок подряд будет ли одинаковым результат для каждой из сортировок?

        Beach b0 = new Beach("a",1.0f,1);
        Beach b1 = new Beach("a",1.0f,1);
        Beach b2 = new Beach("z",2.0f,1);
        Beach b6 = new Beach("a",1.0f,3);
        Beach b3 = new Beach("w",1.0f,1);
        Beach b4 = new Beach("w",1.0f,5);
        Beach b5 = new Beach("z",3.0f,1);

        TreeSet<Beach> beaches = new TreeSet<Beach>();
        beaches.add(b1);beaches.add(b2);beaches.add(b3);beaches.add(b4);beaches.add(b5);beaches.add(b6);beaches.add(b0);
        for (Beach b : beaches){
            System.out.println( b.getName() + " , " + b.getDistance() + " , " + b.getQuality() );
        }

    }
}
