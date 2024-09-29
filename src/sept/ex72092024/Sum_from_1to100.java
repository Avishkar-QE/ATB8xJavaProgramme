package sept.ex72092024;

public class Sum_from_1to100 {
    public static void main(String[] args) {
        int a=1;
        int sum =0;

        while (a<=100)
        {
            sum = sum+a;
            a++;
        }
        System.out.println(sum);
    }
}
