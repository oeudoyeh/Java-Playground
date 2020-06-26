package com.company;

public class Apples {
    private int hour=7;        //we don't want this accessed elsewhere
    private int minute=8;        //we don't want this accessed elsewhere
    private int second=9;        //we don't want this accessed elsewhere


    //zero constructor
    public Apples(){
        this.setTime(0,0,0);
    }
    public Apples(int h){
        this.setTime(h,0,0);
    }
    public Apples(int hour, int minute){
        this.setTime(hour, minute, 0);
    }
    public Apples(int hour, int minute, int second) {
        this.setTime(hour, minute, second);
    }

    public void setTime(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);

    }

    public void setHour(int h){
        hour = ((h<0 || h>24) ? 0:h);
    }
    public void setMinute(int m){
        minute = ((m<0 || m>60) ? 0:m);
    }
    public void setSecond(int s){
        second = ((s<0 || s>60) ? 0:s);
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public String toMilitary(){
        return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
    }

    public String toString(){
        return String.format("The time is: %02d:%02d:%02d %s", ((hour==12||hour==0)?12:(hour%12)),minute, second,((hour>=12)?"PM":"AM") );
    }
}
