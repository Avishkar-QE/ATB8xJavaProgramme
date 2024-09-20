package sept.ex20092024;

public class Triangle_Classifier {
    public static void main(String[] args) {

// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).
        int a=20;
        int b=10;
        int c=40;

        if (a==b && a==c)
        {
            System.out.println("Triangle is equilateral ");
        }
        else if (a==b && a!=c )
        {
            System.out.println("isosceles");
        }

        else if (a==c && a!=b )
        {
            System.out.println("isosceles");
        }

        else if (b==c && b!=a)
        {
            System.out.println("isosceles");
        }

        else
        {
            System.out.println("scalene");
        }

    }








}
