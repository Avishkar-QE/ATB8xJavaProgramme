package logical;

public class To_check_vowel_in_string {
    public static void main (String [] args)
    {
        String str = "Avishkar Sorate ";

        for (int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.println(ch);
            }
        }

    }
}
