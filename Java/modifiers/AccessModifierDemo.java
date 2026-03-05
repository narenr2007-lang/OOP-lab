class AccessExample {

    private int privateVar = 10;
    int defaultVar = 20;          // default access
    protected int protectedVar = 30;
    public int publicVar = 40;

    public void display() {
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Default Variable: " + defaultVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Public Variable: " + publicVar);
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {

        AccessExample obj = new AccessExample();

        obj.display();

        System.out.println("Accessing Public Variable: " + obj.publicVar);
    }
}