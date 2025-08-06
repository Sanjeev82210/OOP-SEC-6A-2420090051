class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class Question16 extends Person {
    int id;
    String course;

    Question16(String name, int id, String course) {
        super(name);
        this.id = id;
        this.course = course;
    }

    void displayDetails() {
        super.display();
        System.out.println("ID: " + id + ", Course: " + course);
    }

    public static void main(String[] args) {
        Question16 s = new Question16("Sannjeev", 101, "AD2006A");
        s.displayDetails();
    }
}