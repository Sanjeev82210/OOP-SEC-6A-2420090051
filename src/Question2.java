import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter gender: ");
        char gender = sc.next().charAt(0);
        System.out.print("Enter percentage: ");
        float percent = sc.nextFloat();

        System.out.printf("Name: %s, Roll: %d, Age: %d, Gender: %c, Percentage: %.2f%%\n",
                name, roll, age, gender, percent);
        sc.close();
    }
}