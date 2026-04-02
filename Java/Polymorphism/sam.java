// Base Class
class Calculator {
    
    // Public method: accessible everywhere
    public int add(int a, int b) {
        System.out.println("Calculator: Standard addition.");
        return a + b;
    }

    // Protected method: accessible in the same package and subclasses
    protected void display() {
        System.out.println("Displaying from Base Calculator.");
    }

    // Private method: strictly bound to this class only
    private void show() {
        System.out.println("Private show() inside Base Calculator.");
    }

    // Public method acting as a gateway to the private method
    public void accessPrivate() {
        show(); 
    }
}

// Derived Class
class AdvancedCalculator extends Calculator {

    // Overriding the base add method to modify behavior
    
    public int add(int a, int b) {
        System.out.println("AdvancedCalculator: Enhanced addition triggered.");
        return (a + b) + 10; // Modifying behavior just to show a difference
    }

    
    
    protected void display() {
        System.out.println("Displaying from Advanced Calculator.");
    }

   
    public void show() {
        System.out.println("Independent show() inside Advanced Calculator.");
    }
}

// Main Execution
public class sam {
    public static void main(String[] args) {
        
        System.out.println("--- 1. Base Class Object ---");
        Calculator baseCalc = new Calculator();
        baseCalc.add(5, 5);
        baseCalc.display();
        baseCalc.accessPrivate();

        System.out.println("\n--- 2. Derived Class Object ---");
        AdvancedCalculator advCalc = new AdvancedCalculator();
        advCalc.add(5, 5);
        advCalc.display();
        advCalc.show(); // Calls its own independent method
        advCalc.accessPrivate(); // Inherited from base, so it triggers base's private method

        System.out.println("\n--- 3. Runtime Polymorphism ---");
        // Parent reference holding a child object
        Calculator polyCalc = new AdvancedCalculator(); 
        
        // Dynamic Method Dispatch in action:
        polyCalc.add(5, 5);       // Calls AdvancedCalculator's add()
        polyCalc.display();       // Calls AdvancedCalculator's display()
        polyCalc.accessPrivate(); // Calls Base Calculator's accessPrivate()
        
        // polyCalc.show(); --> THIS WOULD THROW A COMPILE ERROR
        // The compiler looks at the REFERENCE type (Calculator), where show() is private.
    }
}