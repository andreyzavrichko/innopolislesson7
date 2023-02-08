package com.example;


import java.util.List;

public class Cafe {
    String timeWork;
    Integer timeWorkOne;
    Integer timeWorkTwo;

    List<Integer> weekend;

    public void setWeekend(List<Integer> weekend) {
        this.weekend = weekend;
    }

    public String changeTimeWork(Integer timeWorkOne, Integer timeWorkTwo) {
        this.timeWorkOne = timeWorkOne;
        this.timeWorkTwo = timeWorkTwo;
        this.timeWork = "Время работы " + timeWorkOne + ":00-" + timeWorkTwo + ":00";
        System.out.println(timeWork);
        return timeWork;
    }

    public String changeWeekend(List<Integer> weekend) {
        this.weekend.addAll(weekend);
        String result = "Выходные добавлены " + this.weekend;
        System.out.println(result);
        return result;
    }

    public String deleteWeekend(List<Integer> weekend) {
        this.weekend.removeAll(weekend);
        String result = "Выходной отменен. Новый список " + this.weekend;
        System.out.println(result);
        return result;
    }


    public Cafe() {
    }


    @Override
    public String toString() {
        return "Cafe{" +
                "timeWork='" + timeWork + '\'' +
                ", timeWorkOne=" + timeWorkOne +
                ", timeWorkTwo=" + timeWorkTwo +
                ", weekend=" + weekend +
                '}';
    }
}
