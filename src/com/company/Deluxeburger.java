package com.company;

public class Deluxeburger extends Burger{
    public Deluxeburger() {
        super("deluxe","white", "beef",5.2);
        super.add1toburger("chips",2.4);
        super.add2toburger("drink",1.9);
    }

    @Override
    public void add1toburger(String name, double price) {
        System.out.println("cannot add additional to deluxe burger");
    }

    @Override
    public void add2toburger(String name, double price) {
        System.out.println("cannot add additional to deluxe burger");
    }

    @Override
    public void add3toburger(String name, double price) {
        System.out.println("cannot add additional to deluxe burger");
    }

    @Override
    public void add4toburger(String name, double price) {
        //so when we create a deluxe object and we call those methods we got these output
        System.out.println("cannot add additional to deluxe burger");
    }
}
