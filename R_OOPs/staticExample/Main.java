package com.dsa_bootcamp_assignments.R_OOPs.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human ajay = new Human(29, "Ajay", 10000, false);
//        Human gogi = new Human(26, "Gogi", 15000, true);
        Human dx = new Human(21, "Gogi", 176000, false);

        System.out.println(Human.population);
        fun();

//        System.out.println(ajay.population);
//        System.out.println(gogi.population);
//        System.out.println(dx.population);
    }

    static void fun() {
//        greeting(); you cant use this because it requires an instance
//        But the function you are using it in does not depend on instances

        Main obj = new Main();
        obj.greeting();

        Main funn = new Main();
        funn.anotherFun();

    }

    void anotherFun() {
        greeting();
    }

    void greeting() {
//        fun();
        System.out.println("Hello");
    }
}
