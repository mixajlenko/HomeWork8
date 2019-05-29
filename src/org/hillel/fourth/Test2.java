package org.hillel.fourth;

public class Test2 implements Comparable<Test2>{

    private int intField;

    private String stringField;

    public int getIntField() {
        return intField;
    }

    public Test2(int intField, String stringField) {
        this.intField = intField;
        this.stringField = stringField;
    }

    public String getStringField() {
        return stringField;
    }

    @Override
    public int compareTo(Test2 o) {
        return Integer.compare(this.intField, o.intField);
    }
}
