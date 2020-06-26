package com.company;

public class ThirdClass {
    private int day;
    private int month;
    private int year;

    public ThirdClass(int day, int month, int year){
        System.out.println("Constructor Worked!");
        this.day = day;
        this.month = month;
        this.year = year;
        System.out.printf("Constructor is %s", this);
    }

    @Override
    public String toString() {
        return "ThirdClass{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
