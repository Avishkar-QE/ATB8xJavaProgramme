package sept.ex20092024;

public class Ternary_operator {
    public static void main(String[] args) {
        //condition ? expression_if_true: expression_if_false

//        int a = (30>40)? 80:90;
//        System.out.println(a);

// Input → int score = 85
// String grade →
//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C

    int score = 85;

    String grade = (score>=90) ? "A":(score>=80) ?"B":(score>=70) ?"C":"F";

    System.out.println(grade);

    // Input int - a,b,c - a = 10, b = 20, c = 45
    // Max → a,b,c → c

        int a = 10;
        int b= 20;
        int c =45;

        String max = (a>b && a>c)? "a":(b>a && b>c)? "b": (c>a && c>b)? "c":"some of this are equal numbers" ;

        System.out.println(max);

    }
}