package com.driver;

public class Main {
  public static void main(String[] args) {

        RWOnly rw = new RWOnly();

        //rw.name = "bhanu";
        /* does not work as variable is private
        (only accessible in the class it is created in)..
         Error: 'name' has private access in 'com.driver.RWOnly'
         */

        System.out.println(rw.getName());

        rw.setName("Abhay");

        System.out.println(rw.getName());

    }
}
