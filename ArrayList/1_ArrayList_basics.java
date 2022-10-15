// ArrayList implements the List interface, that allows us to create resiable arrays

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
   
   public static void main(String[] args) {
   		ArrayList<String> animals = new ArrayList<String>();
   		animals.add("Elephant");
   		animals.add("Cat");
   		animals.add("Dog");
   		
   		System.out.println("Animals: ");
   		for(String x: animals) {
   			System.out.println(x);
   		}
   }
    
}