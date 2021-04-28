package DisCu1;

public class Add2Numbers {

    public static int addition(int a, int b) { //Formal parameters

        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int a = 1; //actual parameters
        int b = 10; //actual parameters
        int c = addition(a, b);
        System.out.println(c +" "+"is my result");
    }

}