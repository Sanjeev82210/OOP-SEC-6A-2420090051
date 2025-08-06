/* Explanation
------------------------------------------------------------------------------------------------------
Expression 1: 10 + 2 * 5

* has higher precedence than +.
------------------------------------------------------------------------------------------------
Expression 2: (10 + 2) * 5

Parentheses have the highest precedence
-----------------------------------------------------------------------------------------------------------------
Expression 3: 100 / 5 + 2 * 3 - 4

* and / have higher precedence than + and -, and they associate left-to-right.
+ and - have the same precedence, evaluated left-to-right
--------------------------------------------------------------------------------------------------------
 */
public class Question6 {
    public static void main(String[] args) {
        int a = 10 + 2 * 5;
        int b = (10 + 2) * 5;
        int c = 100 / 5 + 2 * 3 - 4;

        System.out.println("10 + 2 * 5 = " + a);
        System.out.println("(10 + 2) * 5 = " + b);
        System.out.println("100 / 5 + 2 * 3 - 4 = " + c);
    }
}

