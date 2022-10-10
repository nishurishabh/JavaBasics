// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class VotingSystem {
    public static void main(String[] args) {
        int age1 = 20;
        String gender1 = "Male";
        int age2 = 21;
        String gender2 = "Female";
        printCanMarry(age1, gender1);
        printCanMarry(age2, gender2);
    }
    
    /**
    marriage age > 21 (Male)
    marriage age > 18 (Female) 
    **/
    public static void printCanMarry(int age, String gender) {
        boolean canMarry = false;
        if(gender == "Male") {
            if(age >= 21) {
                canMarry = true;
            }
        } else if(gender == "Female") {
            if(age >= 18) {
                canMarry = true;
            }
        }
        else {
            System.out.println("Invalid Arguments");
        }
        
        if(canMarry) {
            System.out.println("Can Vote");
        } else {
            System.out.println("Cannot Vote");
        }
    }
}