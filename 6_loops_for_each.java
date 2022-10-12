import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
  public static void main(String[] args) {
      char[] vowels = {'a', 'e', 'i', 'o', 'u'}; 
      printVowelsUsingForEachLoop(vowels);
  }
 
  public static void printVowelsUsingForEachLoop(char[] vowels) {
      System.out.println("Vowels : ");
      for(char c: vowels) {
          System.out.println(c);
      }
  }
}