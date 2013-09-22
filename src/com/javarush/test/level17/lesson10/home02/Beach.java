package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public static void main (String[] args){
        Beach b0 = new Beach("a",1.0f,1);
        Beach b1 = new Beach("a",1.0f,1);
        Beach b2 = new Beach("b",1.0f,1);
        Beach b3 = null;
        Beach b4 = new Beach("",0f,0);
        Beach b5 = new Beach("a",1.0f,1);
        System.out.println( "b0 = new Beach(\"a\",1.0f,1)" );
        System.out.println( "b1 = new Beach(\"a\",1.0f,1)" );
        System.out.println( "b2 = new Beach(\"b\",2.0f,2)" );

        System.out.println("b0.compareTo(b1) : " + b0.compareTo(b1));
        System.out.println("b1.compareTo(b0) : " + b1.compareTo(b0));
        System.out.println("b1.compareTo(b2) : " + b1.compareTo(b2));
        System.out.println("b2.compareTo(b1) : " + b2.compareTo(b1));

//        System.out.println("7 > " + b3.compareTo(b1));
//        System.out.println("8 > " + b1.compareTo(b3));

    }

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o) throws NullPointerException
    {
        if ( o.equals(null) || this.equals(null) ) { throw new NullPointerException(); }
        int cstr = name.compareTo(o.getName());
        if  ( cstr  != 0 ) return cstr;
        int cflt = Float.compare(distance,o.getDistance());
        if  ( cflt  != 0 ) return cflt;
        int cint = Integer.compare(quality,o.getQuality());
        if  ( cint  != 0 ) return cint;
        return 0;
    }
}
