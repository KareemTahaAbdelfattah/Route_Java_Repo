package Day2;

/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Course
 ** @brief: Operators Assignment
/** ==============================================**/

public class Operators {
    public static void main(String[] args) {
        // Variables
        int a = 20;
        int b = 10;
        int c = 3;
        int d = 2;
        boolean x = true;
        boolean y = false;

        System.out.println("Values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("\nArithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * c = " + (a * c));
        System.out.println("a / d = " + (a / d));
        System.out.println("a % c = " + (a % c));

        System.out.println("\nRelational Operators:");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        System.out.println("\nLogical Operators:");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));
        System.out.println("!y = " + (!y));

        System.out.println("\nBitwise Operators:");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));

        System.out.println("\nShift Operators:");
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >>> 1 = " + (a >>> 1));

        System.out.println("\nAssignment Operators:");
        int result = a;
        result += b;
        System.out.println("result += b -> " + result);

        result = a;
        result -= c;
        System.out.println("result -= c -> " + result);

        result = a;
        result *= d;
        System.out.println("result *= d -> " + result);

        result = a;
        result /= d;
        System.out.println("result /= d -> " + result);

        result = a;
        result %= c;
        System.out.println("result %= c -> " + result);

        System.out.println("\nUnary Operators:");
        int num = 5;
        System.out.println("num = " + num);
        System.out.println("++num = " + (++num));
        System.out.println("num++ = " + (num++));
        System.out.println("after num++ = " + num);
        System.out.println("--num = " + (--num));
        System.out.println("num-- = " + (num--));
        System.out.println("after num-- = " + num);

        System.out.println("\nTernary Operator:");
        String max = (a > b) ? "a is greater" : "b is greater or equal";
        System.out.println(max);
    }
}