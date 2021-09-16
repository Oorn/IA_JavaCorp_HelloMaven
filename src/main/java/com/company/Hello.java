package com.company;

import java.util.Date;

public class Hello {
    public boolean returnTrue() {
        return true;
    }
    public int returnSquareInt(int a) {
        return a*a;
    }
    public void printHello() {
        Date date = new Date();
        System.out.println("Hello World: " + date);
    }
    public static void main(String[] args) {
        Hello h = new Hello();
        h.printHello();
    }
}
