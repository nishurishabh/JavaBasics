// The switch statement allows us to execute a block of code among many alternatives.
// Write a Java program to check whether a number is positive, negative or zero using switch case.

 /** 
     * switch(condition) {
     * case val1: {}
     * case val2: {}
     * case val3: {}
     * default: {}
**/
class OddEvenSystem {
    public static void main(String[] args) {
        findTypeOfNumber(12);
        findTypeOfNumber(11);
    }
    
   
    public static void findTypeOfNumber(int number) {
        switch(number % 2) {
            case 0: {System.out.println("Even Number"); break;}
            case 1: {System.out.println("Odd Number"); break;}
            default: {System.out.println("Invalid Arg"); break;}
        }
    } 
}