// static func can be called without creating an object
// non static funcs need a obj of the class to be called
import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.LocalDate;

class Main {
   
   public static void printDate() {
       LocalDate curDate = LocalDate.now();
       System.out.println("Static Function called!");
       System.out.println("Today's date is: " + curDate);
   }
   
   int add(int a, int b) {
       System.out.println("Non-static Function called!");
       return a+b;
   }
   
   public static void main(String[] args) {
   		printDate();
   		
   		Main mainObj = new Main();
   		int a = 10;
   		int b = 20;
   		System.out.println(a + " + " + b + " = " + mainObj.add(a,b));
   }
    
}