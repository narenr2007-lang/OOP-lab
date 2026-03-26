class Calculator {

   public int add(int a, int b) {
        int sum = a + b;
        return sum; 
    }

    protected int add(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    private double add(double a, double b) {
        double sum = a + b;
        return sum;
    }


    public void displayDecimalAddition(double a, double b) {
        double result = add(a, b); 
        System.out.println("Result: " + result);
    }
}

public class main {
    public static void main(String[] args) {
        
        Calculator myCalc = new Calculator();

        System.out.println("2 Ints: " + myCalc.add(5, 10));
        System.out.println("3 Ints: " + myCalc.add(5, 10, 15));
        myCalc.displayDecimalAddition(10.5, 2.5);
    }
}
