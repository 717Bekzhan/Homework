package com.company;

public class Class {
   private int number ;
    private String string;
    private int[] array;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public Class(int number, String string, int[] array) {
        this.number = number;
        this.string = string;
        this.array = array;
    }
}
