import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double: ");
        double d = sc.nextDouble();
        int i = (int) d;

        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        sc.close();
    }
}