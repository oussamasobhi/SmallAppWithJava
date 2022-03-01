package com.company;

public class Healthyburger extends Burger{
    private String healthadd1name;
    private double healthadd1price;
    private String healthadd2name;
    private double healthadd2price;

    public Healthyburger(String meat, double price) {
        super("healthy","brown", meat, price);
    }
    public void addhealthadd1(String name,double price){
        this.healthadd1name=name;
        this.healthadd1price=price;
    }
    public void addhealthadd2(String name,double price){
        this.healthadd2name=name;
        this.healthadd2price=price;
    }

    @Override
    public double totalprice() {
        double hamberger=super.totalprice();
        if(this.healthadd1name!=null){
            hamberger+=this.healthadd1price;
            System.out.println("add of the "+this.healthadd1name+" with price of "+this.healthadd1price);
        }
        if(this.healthadd2name!=null){
            hamberger+=this.healthadd2price;
            System.out.println("add of the "+this.healthadd2name+" with price of "+this.healthadd2price);
        }
        return hamberger;
    }
}
