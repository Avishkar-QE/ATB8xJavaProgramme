package logical;

public class Swap_two_numbers {
    public static void main (String [] args)
    {
        int a=10, b=20;
        b = b+a; // now b is sum of both a and b
        a = b-a; // b - a = sum of both a and b - a = a (original value of a)
        b = b-a; // (b+a)- b = a (b is swaped)

        System.out.println(b);
        System.out.println(a);
    }
}
