/*
 * Name of the class : HelloWorld
 * Defn of class : Code inside the class
 * Every application in Java should have a main class. When application is started, it executes the main function. 
 */







class HelloWorld {
    
    public static void main(String[] args) {
        String name = "Rishabh";
        printHelloWorld(name);
    }

    public static void printHelloWorld(String name) {
        System.out.println("Hello world, First program by : "+name);
    }
}