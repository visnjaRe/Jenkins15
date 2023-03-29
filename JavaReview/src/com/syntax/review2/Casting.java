package com.syntax.review2;

public class Casting {
    public static void main(String[] args) {

        /*Casting is a process when we convert 1 datatype to another.
        1. widening/implicit(automatic)
        2. narrowing/explicit(manual)

         */

 //widening

        double d=5;
        System.out.println(d); //5.0 we can cast smaller number into larger automatically

        //narrowing

        int i=(int)5.0;
        System.out.println(i); //5

        int num=128;
        byte b=(byte)num;
        System.out.println(b);
        //as testers we won't be doing narrowing to cast primitives

    }
}
