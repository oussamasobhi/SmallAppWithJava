package com.company;


import java.util.*;

public class Main{
    public static void main(String [] args){
   Burger ham=new Burger("m9awd","white","beef",3.5);
   ham.add1toburger("tomatoes",0.2);
        System.out.println(ham.totalprice());

   Healthyburger bnin=new Healthyburger("chicken",10);
   bnin.addhealthadd1("tomate",0.2);
   bnin.add1toburger("cheese",0.5);
        System.out.println(bnin.totalprice());

        Deluxeburger deluxe=new Deluxeburger();
        deluxe.totalprice();

    }
}
