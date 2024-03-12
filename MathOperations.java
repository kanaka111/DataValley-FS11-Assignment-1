//Polymorphism
// Create a Java class MathOperations with overloaded methods for addition (add) that can accept two integers, three doubles, and two strings, respectively. Demonstrate the usage of these methods in the main method by adding two integers, three doubles, and concatenating two strings.

public class MathOperations {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method to add three doubles
    public  double add(double a, double b, double c) {
        return a + b + c;
    }
    
    // Method to concatenate two strings
    public  String add(String a, String b) {
        return a + b;
        }
    
    // Demonstration of usage
    public static void main(String[] args) {
        MathOperations op=new MathOperations();
        int sumInt = op.add(3,7);
        System.out.println("Sum of two integers: " + sumInt);
        
        double sumDouble = op.add(6.9,66.7,5.3);
        System.out.println("Sum of three doubles: " + sumDouble);
        
        String concate = op.add("Hello, ", "This is Maha.");
        System.out.println("Concatenated string: " + concate);
    }
}
