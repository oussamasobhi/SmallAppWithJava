package com.company;

import java.util.Queue;

public class Burger {
    private  String name;
    private String breadRolltype;
    private String meat;
    private double price;

    private String add1Name;
    private double add1price;

    private String add2Name;
    private double add2price;

    private String add3Name;
    private double add3price;

    private String add4Name;
    private double add4price;
    public Burger(String name,String breadRolltype, String meat, double price) {
        this.breadRolltype = breadRolltype;
        this.meat = meat;
        this.price = price;
        this.name=name;
    }

    public void add1toburger(String name,double price){
        this.add1Name=name;
        this.add1price=price;
    }
    public void add2toburger(String name,double price){
        this.add2Name=name;
        this.add2price=price;
    }
    public void add3toburger(String name,double price){
        this.add3Name=name;
        this.add3price=price;
    }
    public void add4toburger(String name,double price){
        this.add4Name=name;
        this.add4price=price;
    }
    public double totalprice(){
        double burgerprice=this.price;
        System.out.println("the hamburger "+this.name+" cost "+this.price);
        if(this.add1Name!=null){
            burgerprice+=this.add1price;
            System.out.println("add of the "+this.add1Name+" with a price of "+this.add1price);
        }
        if(this.add2Name!=null){
            burgerprice+=this.add2price;
            System.out.println("add of the "+this.add2Name+" with a price of "+this.add2price);
        }
        if(this.add3Name!=null){
            burgerprice+=this.add3price;
            System.out.println("add of the "+this.add3Name+" with a price of "+this.add3price);
        }
        if(this.add4Name!=null){
            burgerprice+=this.add4price;
            System.out.println("add of the "+this.add4Name+"with a price of "+this.add4price);
        }
   return burgerprice;
    }
}
