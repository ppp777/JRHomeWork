package com.javarush.test.level14.lesson04.Factory;

public class MoldovanHen extends Hen
{
    public String getDescription()
    {
        return super.getDescription()+ " Моя страна Молдавия. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
    }
    public int getCountOfEggsPerMonth(){
        return 4;
    }
}
