package sept.ex72092024;

public class First_5_Even_numbers {
    public static void main(String[] args) {
        int a=1;
        int count=0;
        do {
            if (a % 2 == 0) {
                System.out.println(a);
                count++;
            }
            a++;
        }while (a<=100 && count<5);
        }
    }
