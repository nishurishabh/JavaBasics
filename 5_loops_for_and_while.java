import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        int x = 12;
        printTable(x);
    }
     
    public static void printTable(int x) {
        System.out.println("For Loop"); 
        for(int i=1; i<=10; i++) {
            System.out.println(x + " X " + i + " = "+x*i);
        }
        
        System.out.println("While Loop");
        int j = 1; 
        while(j<=10) {
            System.out.println(x + " X " + j + " = "+x*j);
            j++; 
        }
    }
  }