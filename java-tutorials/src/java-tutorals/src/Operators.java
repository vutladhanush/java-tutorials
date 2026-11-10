public class Operators {
        public static void main(String[] args) {
            int a = 10, b = 3, c = 5;

            System.out.println("Sum: " + a+b);
            System.out.println("Difference: " + (a-b));
            System.out.println("Multiplication: " + a*b);
            System.out.println("Division: " + a/b);
            System.out.println("Modulus: " + a%b);

            // Using unary operators
            System.out.println("Postincrement : " + a++);
            System.out.println("Preincrement : " + ++a);
            System.out.println("Postdecrement : " + b--);
            System.out.println("Predecrement : " + --b);

            // Comparison operators
            System.out.println("a > b  : " + (a > b));
            System.out.println("a < b  : " + (a < b));
            System.out.println("a >= b : " + (a >= b));
            System.out.println("a <= b : " + (a <= b));
            System.out.println("a == c : " + (a == c));
            System.out.println("a != c : " + (a != c));

            // Logical operators
            boolean x = true;
            boolean y = false;

            System.out.println("x && y : " + (x && y));
            System.out.println("x || y : " + (x || y));
            System.out.println("!x     : " + (!x));

            // Ternary operator
            int result=0;
            result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
            System.out.println("Max of three numbers = "+ result);

            // Bitwise operators
            int d = 0b1010;
            int e = 0b1100;

            System.out.println("d & e : " + (d & e));
            System.out.println("d | e : " + (d | e));
            System.out.println("d ^ e : " + (d ^ e));
            System.out.println("~d : " + (~d));
            System.out.println("d << 2 : " + (d << 2));
            System.out.println("e >> 1 : " + (e >> 1));
            System.out.println("e >>> 1 : " + (e >>> 1));
        }
    }

