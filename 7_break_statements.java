import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      experimentWithBreak();
  }
   
  public static void experimentWithBreak() {
      int[] arr = {1,2,3,-1,1};
      int sum=0;
      
      for(int x: arr) {
          if(x < 0) {
              break;
          }
          sum+=x;
          System.out.println("SUM: "+sum+"\n");
      }
      
      System.out.println("Program Terminated with SUM: "+sum);
  }
}