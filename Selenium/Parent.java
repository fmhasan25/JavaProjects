package Selenium;
import java.util.Scanner;

public class Parent {
    public static void main(String[] args) {
        //this step prints in the output
        System.out.println("I Navigated to home page");

        Methods m = new Methods();
        System.out.println(m.ValidateHeader());



        //Classobject.methodname

        ClassB n = new ClassB();
        System.out.println(n.ValidateHeader());

    }
}