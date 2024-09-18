package sept.ex18092024;

public class Type_casting {
    public static void main(String[] args) {

        //type casting
        // widening - explicit, implicit - lossless
        //narrowing - explicit , implicit - loss


        //widening
        byte b = 10;
        int a =b; // implicit
        int a1 =(int)b; // explicit


        // narrowing
        // implicit casting not possible as we get syntax error

        //explicit casting narrowing cause loss of data
        int g = 990;
        byte p = (byte)g;
        System.out.println(p);
    }
}
