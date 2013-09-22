package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/


public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество



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
//        int cstr = o.getName().compareTo(name);
        if  ( cstr  != 0 ) return cstr;
        int cflt = Float.compare(distance,o.getDistance());
        if  ( cflt  != 0 ) return cflt;
        int cint = Integer.compare(quality,o.getQuality());
        if  ( cint  != 0 ) return cint;
        return 0;
    }
}
