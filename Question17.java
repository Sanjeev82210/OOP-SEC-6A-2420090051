class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Lion roars");
    }
}

public class Question17 {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.roar();
    }
}