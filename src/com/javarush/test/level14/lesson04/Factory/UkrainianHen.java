package com.javarush.test.level14.lesson04.Factory;

public class UkrainianHen extends Hen
{
    public String getDescription()
    {
        return super.getDescription()+ " Моя страна Украина. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
    }
    public int getCountOfEggsPerMonth(){
        return 8;
    }
}
