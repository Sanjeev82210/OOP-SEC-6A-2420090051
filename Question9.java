import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a: " + Integer.toBinaryString(a) + ", b: " + Integer.toBinaryString(b));
        System.out.println("AND: " + Integer.toBinaryString(a & b) + " (" + (a & b) + ")");
        System.out.println("OR: " + Integer.toBinaryString(a | b) + " (" + (a | b) + ")");
        System.out.println("XOR: " + Integer.toBinaryString(a ^ b) + " (" + (a ^ b) + ")");
        System.out.println("Left Shift a: " + Integer.toBinaryString(a << 1) + " (" + (a << 1) + ")");
        System.out.println("Right Shift a: " + Integer.toBinaryString(a >> 1) + " (" + (a >> 1) + ")");
        sc.close();
    }
}