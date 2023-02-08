package com.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        List<Integer> list = new ArrayList<>();
        list.add(3);
        cafe.setWeekend(list);

        // Изменяем время
        cafe.changeTimeWork(10, 18);
        // Изменяем выходные
        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        cafe.changeWeekend(list1);
        // Удаляем выходной
        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        cafe.deleteWeekend(list2);

    }
}
