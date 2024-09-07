public class Main {
    public static void main(String[] args) {
        System.out.println("welcome our simple calcualtor " + "");

        System.out.println(add(2,3));
        System.out.println(mult(2,3));

        int result = devision(2, 3);
        System.out.println(result);
        System.out.println(devision(2,1));



        result = sub(8,4);

        System.out.println("sub results "  + result);

    }

    public static int add(int a, int b) {
        return  a + b;
    }


    public static int mult(int a, int b) {
        return  a * b;
    }
    public static int devision(int a, int b) {
        return a / b;
    }

    public  static  int sub(int a, int b ) {
        return a-b;
    }

}