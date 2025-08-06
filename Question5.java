import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        int ascii = c;

        System.out.println("Character: " + c);
        System.out.println("ASCII: " + ascii);
        sc.close();
    }
}