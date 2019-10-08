import java.io.*;

public class Main {
    public static void main(String []args) throws IOException {
        //System.out.println(mathSum(2, 2));
        //System.out.println(mathDif(2, 2));
        //System.out.println(mathDiv(2, 2));
        //System.out.println(mathMul(2, 2));
        Init();
    }
    public static void Init()  {
        try { // if
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            int a, b, k = 0;
            String text = "";
            System.out.println("//(Handle integer)");
            System.out.print("Enter number a: ");
            a = Integer.valueOf(text = br.readLine());
            System.out.println("Your first number = " + a);
            System.out.print("Enter number b: ");
            b = Integer.valueOf(text = br.readLine());
            System.out.println("Your second number = " + b);
            System.out.print("Enter the math function (/, *, +, -): ");
            boolean state = false;
            do {
                text = br.readLine();
                //if ((text != "/" || text != "*" || text != "+" || text != "-")) {
                //    System.out.println("Invalid function, enter a function.");
                //}
                state = (text.equals("/") || text.equals("*") || text.equals("+") || text.equals("-"));
                //System.out.println(text.equals("/"));
                //System.out.println(text.equals("*"));
                //System.out.println(text.equals("-"));
                //System.out.println(text.equals("+"));
                //System.out.println(state);
                if (!state) {
                    System.out.println("Invalid math function.");
                    System.out.print("Enter the math function (/, *, +, -): ");
                } else {
                    if (text.equals("/")) {
                        k = 3;
                    } else if (text.equals("*")) {
                        k = 4;
                    } else if (text.equals("+")) {
                        k = 1;
                    } else if (text.equals("-")) {
                        k = 2;
                    } else k = 0;
                }
            } while (!state);
            System.out.println("Your math function \"" + text + "\"");
            //System.out.println(k);

            //System.out.println("Number a = " + a + ", number b = " + b);
            System.out.println("Output number = " + selectFun(k, a, b));
            //while(!(text = br.readLine()).equals("ESC")) {}
        } catch(Exception e) { /* else */ }
    }
    public static int mathSum(int a, int b) {
        return a + b;
    }
    public static int mathDif(int a, int b) {
        return a - b;
    }
    public static int mathDiv(int a, int b) {
        return b == 0 ? 0 : a / b;
    }
    public static int mathMul(int a, int b) {
        return a * b;
    }
    public static int selectFun(int num, int a, int b) {
        int result = -1;
        switch(num) {
            case 1: System.out.println("Sum = " + (result = mathSum(a, b)));
                break;
            case 2: System.out.println("Difference = " + (result = mathDif(a, b)));
                break;
            case 3: System.out.println("Division = " + (result = mathDiv(a, b)));
                break;
            case 4: System.out.println("Multiply = " + (result = mathMul(a, b)));
                break;
            default: System.out.println("Invalid function.");
        }
        return result;
    }
}