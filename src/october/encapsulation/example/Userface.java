package october.encapsulation.example;

public class Userface {
    public static void main(String[] args) {

        ICICIBank avishkar = new ICICIBank("Avishkar",100000000);
        System.out.println(avishkar.getBalance());

        boolean Admin = true; // We can add code to check if authenticated here to allow setter method
        avishkar.setBalance(500000000,Admin);
        System.out.println(avishkar.getBalance());

    }
}
