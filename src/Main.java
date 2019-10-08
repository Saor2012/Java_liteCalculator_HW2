import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String []args) throws IOException {
        //System.out.println(mathSum(2, 2));
        //System.out.println(mathDif(2, 2));
        //System.out.println(mathDiv(2, 2));
        //System.out.println(mathMul(2, 2));
        //Init();
        arrayTest1();
    }
    public static void Init()  {
        try { // if
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            int a, b, k = 0;
            boolean state = false;
            String text = "";
            System.out.println("//(Handle integer)");
            System.out.print("Enter number a: ");
            a = Integer.valueOf(text = br.readLine());
            System.out.println("Your first number = " + a);
            System.out.print("Enter number b: ");
            b = Integer.valueOf(text = br.readLine());
            System.out.println("Your second number = " + b);
            System.out.print("Enter the math function (/, *, +, -): ");
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
    public static void arrayTest1 () {
        /* Test 1
        int []arr1 = new int[10], arr2;
        int i, j, length;
        for (i = 0; i < 10; i++) {
            arr1[i] = i + 1;
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }

        length = i / 2;
        arr2 = new int [length];
        for (i = 0, j = 0; i < 10; i++) {
            if (arr1[i] % 2 == 0) {
                arr2[j] = arr1[i];
                System.out.println("arr2[" + j + "] = " + arr2[j]);
                j++;
            }
        }*/
        /* Tast 2
        int []arr1 = new int[5], arr2;
        int i, j;

        for (i = 0; i < 5; i++) {
            arr1[i] = i + 1;
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }

        arr2 = new int [6];
        for (i = 0, j = 0; j < 6; j++) {

            if (j == 0) {
                arr2[j] = 10;
                System.out.println("\narr2[" + j + "] = " + arr2[j]);
                continue;
            }

            arr2[j] = arr1[i];
            System.out.println("arr2[" + j + "] = " + arr2[j]);
            i++;
        }*/
        /* Test 3
        ArrayList<Integer> List1= new ArrayList<Integer>();
        int i;

        for (i = 0; i < 10; i++) {
            List1.add(i + 1);
            System.out.println("arr1[" + i + "] = " + List1.get(i));
        }

        for (i = 0; i < 9; i++)
            List1.set(i, List1.get(i) + List1.get(i + 1));
        for (i = 0; i < 10; i++)
            System.out.println("arr1[" + i + "] = " + List1.get(i));

        */
        /* Test 4
        int i, j;
        char [][]arr = new char[7][7];
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 7; j++) {
                arr[i][j] = '*';
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }*/
        abstract class BaseArray {
            int[] arr = null;
            int index;
            protected
                abstract void add(int value);
                abstract void remove(int index);
                abstract int size();
                abstract String newToString();
        }
        class MyClass extends BaseArray {
            MyClass() {
                init();
                for (int i = 0; i < 10; i++) {
                    add(i + 1);
                }
            }
            void init() {
                this.arr = new int[10];
            }
            @Override
            public void add(int value) {
                arr[index++] = value;
            }
            @Override
            public void remove(int index) {
                int []newArr = new int[this.index - 1];
                int i;
                System.out.println(newArr.length);
                for (i = 0; i < index; i++) {
                    if (i == index) {
                        i--;
                    } else {
                        newArr[i] = arr[i];
                        System.out.println("New[" + i + "] = " + newArr[i]);
                    }
                }
                System.out.println("Size" + index);
                arr = null;
                this.index--;
                arr = new int[index];
                for (i = 0; i < this.index; i++) {
                    //if (i == index)
                    arr[i] = newArr[i];
                }
            }
            @Override
            public int size() {
                return arr.length;
            }
            @Override
            public String newToString() {
                //String str = new String[];
                String str = "";
                for (int i = 0; i < index; i++) {
                    str += "Array[" + i + "] = " + this.arr[i] + " \n";
                }
                return str;
            }
            public void showArray() {
                for (int i = 0; i < 10; i++)
                    System.out.println(arr[i]);
                //System.out.println(index);
            }
        }
        MyClass arr = new MyClass();
        arr.showArray();
        arr.remove(5);
        arr.showArray();
        //System.out.println(arr.size());
        //System.out.println(arr.newToString());
    }
}