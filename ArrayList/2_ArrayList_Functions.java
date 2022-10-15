// ArrayList implements the List interface, that allows us to create resiable arrays

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
   
   public static void main(String[] args) {
   		ArrayList<String> countryCode = new ArrayList<String>();
   		// ArrayList.add()
   		countryCode.add("SG");
   		countryCode.add("PH");
   		
   		System.out.println("Country Codes: "+countryCode);
   		
   		HashSet<String> countryCodesFromAPI = new HashSet<String>();
   		
   		countryCodesFromAPI.add("TH");
   		countryCodesFromAPI.add("VN");
   		countryCodesFromAPI.add("MY");
   		
   		// ArrayList.addAll()
   		countryCode.addAll(countryCodesFromAPI);
   		System.out.println("Country Codes: " + countryCode);
   		
   		// ArrayList.get(index)
   		int index = 3;
   		System.out.println(countryCode.get(3));
   		
   		// ArrayList.set(index, value)
   		countryCode.set(4, "CM");
		System.out.println("Country Codes: "+countryCode); 
		
		// ArrayList.remove(index)
		String s = countryCode.remove(countryCode.size()-1);
		System.out.println("Removed Country Codes: " + s); 
		System.out.println("Country Codes: "+countryCode); 
		
		// Iterate through the ArrayList
		int x=0;
		for(String i : countryCode) {
			System.out.println("Country Codes[" + x++ + "]: " + i);
		}
   		
   }
    
}