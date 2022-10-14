// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
import java.lang.*;
import java.io.*;

class HelloWorld {
    public static void main(String[] args) {
        String[] names = new String[2];
        names[0] = "Harry";
        names[1] = "Sejal";
        
        int[] age = {12,10};
        
        System.out.println("Person1: "+names[0]+ " and age : "+age[0]);
        System.out.println("Person1: "+names[1]+ " and age : "+age[1]);
        
        String[] cities = {"Agra", "Delhi", "Varanasi"};
        
        System.out.println("Cities: ");
        for(String s : cities) {
            System.out.println(s);
        }
    }
    
    
}