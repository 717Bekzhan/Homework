package com.company;

public class Main {

    public static void main(String[] args) {
        int[] masiv ={1,2,3,4,5,6};
	Class class1 = new Class(12, "Bekzhan", masiv);
        for (int a: masiv) {
            System.out.print(a + " ");
        }
        System.out.println(class1.getNumber() + " " +class1.getString() );
    }
}
