package com.dsa_bootcamp_assignments.R_OOPs.staticExample;




public class InnerClass {


    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Ajay");
        Test b = new Test("Dx");

        System.out.println(a);
        System.out.println(b);
    }
}

//static class A {
//
//}