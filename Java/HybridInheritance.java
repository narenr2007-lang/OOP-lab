
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}


class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}


class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {

        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}