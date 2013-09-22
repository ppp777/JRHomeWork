package com.javarush.test.level14.lesson04.Factory;

public class RussianHen extends Hen
{
    public String getDescription()
    {
        return super.getDescription()+ " Моя страна Россия. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
    }
    public int getCountOfEggsPerMonth(){
        return 7;
    }
}
