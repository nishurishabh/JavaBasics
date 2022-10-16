// Class is a blueprint or prototype which defines the member variables and functions that the instance of the class will have. 

import java.util.*;
import java.lang.*;
import java.io.*;

class Lamp {
    
    boolean isOn; 
    
    void turnOn() {
        isOn = true;
    }
    
    void turnOff() {
        isOn = false;
    }
    
    void printState() {
        
        if(isOn) {
            System.out.println("The lamp is turned on");
        } else {
            System.out.println("The lamp is turned off");
        }
    }
    
}

class Main {
   
   public static void main(String[] args) {
   		Lamp studyLamp = new Lamp();
   		studyLamp.turnOn();
   		studyLamp.printState();
   		
   		studyLamp.turnOff();
   		studyLamp.printState();
   }
    
}