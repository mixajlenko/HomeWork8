package org.hillel;

import java.util.Map;
import java.util.Set;

public final class Print {

    /**
     *
     * Реализация Singleton (?)
     *
     */
    public final static Print methods = new Print();

    public static Print getMethodsSingleton() {
        return methods;
    }

    public Print() {
    }

    static void print(Map<Integer, String> m){

        //выdести на консоль значение всех ключей и значений с помощью метода entrySet()
        System.out.println("Вывод с помощью entrySet()\n");
        for (Map.Entry<Integer, String> item : m.entrySet()) {
            System.out.printf("Key: %d;  Value: %s; \n", item.getKey(), item.getValue());
        }
        System.out.println("\n");

        //вывести на консоль значение всех ключей и значений с помощью метода keySet()
        System.out.println("Вывод с помощью keySet()\n");
        Set<Integer> a = m.keySet();
        for (int b : a) {
            System.out.println("Key: " + b + "; Value: " + m.get(b) + ";\n");
        }
    }
}
