public class Question15 {
    int id;
    String name;
    String course;

    Question15() {
        this(0, "Unknown", "None");
    }

    Question15(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Course: " + course);
    }

    public static void main(String[] args) {
        Question15 s1 = new Question15();
        Question15 s2 = new Question15(101, "Sanjeev", "24AD2006");

        s1.displayDetails();
        s2.displayDetails();
    }
}