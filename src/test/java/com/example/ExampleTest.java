package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ExampleTest {
    Cafe cafe;

    @BeforeEach
    void setUp() {
        cafe = new Cafe();
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        cafe.setWeekend(list);
    }

    @Test
    void checkChangeTime() {
        String result = cafe.changeTimeWork(3, 11);
        Assertions.assertEquals("Время работы 3:00-11:00", result);
    }

    @Test
    void checkChangeWeekend() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        cafe.changeWeekend(list1);
        String result = cafe.changeWeekend(list1);
        Assertions.assertEquals("Выходные добавлены [3, 5, 7, 1, 1]", result);
    }


    @Test
    void checkDeleteWeekend() {
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        String result = cafe.deleteWeekend(list2);
        Assertions.assertEquals("Выходной отменен. Новый список [5, 7]", result);
    }


}
