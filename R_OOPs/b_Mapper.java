package com.dsa_bootcamp_assignments.R_OOPs;

public class b_Mapper {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a);
        System.out.println(b);

        final A ajay = new A("Ajay");
        ajay.name = "othername";

//        When a non primitive is final, you cannot reassign it
//        ajay = new A("new name");
        System.out.println(ajay.name);

        for (int i = 0; i < 10000000; i++) {
            A aj = new A("Aj");
        }

//        final int bonus = 2;
//        bonus = 3;
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

    static class A {
        final int num = 10;
        String name;

        public A(String name) {
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed");
        }
    }

}