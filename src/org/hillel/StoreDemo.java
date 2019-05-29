package org.hillel;

import org.hillel.fourth.Test2;
import org.hillel.second.Test;

import java.util.*;

public class StoreDemo {
    public static void main(String[] args) {

        StoreDemo run = new StoreDemo();

        System.out.println("Результат вывода задания 1:\n");
        run.task1();
        System.out.println("Результат вывода задания 2:\n");
        run.task2();
        System.out.println("Результат вывода задания 3:\n");
        run.task3();
        System.out.println("Результат вывода задания 4:\n");
        run.task4();

    }

    private void task1() {

        HashMap<Integer, String> states = new HashMap();

        states.put(1, "q");
        states.put(2, "w");
        states.put(4, "e");
        states.put(3, "r");
        states.put(5, "t");
        states.put(6, "y");
        states.put(7, "u");
        states.put(8, "i");
        states.put(9, "o");
        states.put(10, "p");

        Print.getMethodsSingleton().print(states); //

    }

    private void task4(){

        //intField = Площадь города в км^2 указанного в значениее treeMap.
        Test2 tree1 = new Test2(405, "Dnipro");
        Test2 tree2 = new Test2(848, "Kyiv");
        Test2 tree3 = new Test2(182, "Lviv");
        Test2 tree4 = new Test2(350, "Kharkiv");
        Test2 tree5 = new Test2(162, "Odessa");

        Map<Integer,String> tree = new TreeMap<>();

        tree.put(tree1.getIntField(), tree1.getStringField());
        tree.put(tree2.getIntField(), tree2.getStringField());
        tree.put(tree3.getIntField(), tree3.getStringField());
        tree.put(tree4.getIntField(), tree4.getStringField());
        tree.put(tree5.getIntField(), tree5.getStringField());

        Print.getMethodsSingleton().print(tree);

    }

    private void task2(){

        Test test = new Test(1,"Oleg");
        Test test2 = new Test(2, "Vanya");
        Test test3 = new Test(3, "Dima");
        Test test4 = new Test(4, "Sasha");

        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(test.getIntField(), test.getStringField());
        mapa.put(test2.getIntField(), test2.getStringField());
        mapa.put(test3.getIntField(), test3.getStringField());
        mapa.put(test4.getIntField(), test4.getStringField());

        Print.getMethodsSingleton().print(mapa);
    }

    private void task3(){

        Map<String, String> linkedMap = new LinkedHashMap<>();

        linkedMap.put("first", "L");
        linkedMap.put("second", "i");
        linkedMap.put("third", "n");
        linkedMap.put("fourth", "k");
        linkedMap.put("fifth", "e");
        linkedMap.put("sixth", "d");
        linkedMap.put("seventh", "H");
        linkedMap.put("eighth", "a");
        linkedMap.put("ninth", "s");
        linkedMap.put("tenth", "h");

        //выdести на консоль значение всех ключей и значений с помощью метода entrySet()
        System.out.println("Вывод с помощью entrySet()\n");
        for (Map.Entry<String, String> item : linkedMap.entrySet()) {
            System.out.printf("Key: %s;  Value: %s; \n", item.getKey(), item.getValue());
        }
        System.out.println("\n");

        //вывести на консоль значение всех ключей и значений с помощью метода keySet()
        System.out.println("Вывод с помощью keySet()\n");
        Set<String> a = linkedMap.keySet();
        for (String b : a) {
            System.out.println("Key: " + b + "; Value: " + linkedMap.get(b) + ";\n");
        }
    }
}


