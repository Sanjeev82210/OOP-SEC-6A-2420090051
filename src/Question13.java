public class Question13 {
    static String collegeName;
    static {
        collegeName = "KLH University";
    }
    int id;
    String name;

    Question13(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static void changeCollegeName(String collegeName) {
        Question13.collegeName = collegeName;
    }

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", College: " + collegeName);
    }

    public static void main(String[] args) {
        Question13 s1 = new Question13(90051, "Sanjeev");
        Question13 s2 = new Question13(90051, "SANJEEV");

        s1.displayDetails();
        s2.displayDetails();

        changeCollegeName("KLH Deemed University");
        s1.displayDetails();
        s2.displayDetails();
    }
}