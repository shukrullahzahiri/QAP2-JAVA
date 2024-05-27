public class CreditCardDemo {
    public static void main(String[] args) {
        final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);

        Address address = new Address("237J Harvey Hall", "Menomonie", "WI", "54751");
        Person owner = new Person("Christie", "Diane", address);
        CreditCard visa = new CreditCard(owner, LIMIT);

        System.out.println(visa.getPersonals()); // Expected: Christie Diane 237J Harvey Hall Menomonie WI 54751
        System.out.println("Balance: " + visa.getBalance()); // Expected: $0.00
        System.out.println("Credit Limit: " + visa.getCreditLimit()); // Expected: $1000.00

        System.out.println();
        System.out.println("Attempt to charge " + FIRST_AMOUNT);
        visa.charge(FIRST_AMOUNT); // Expected: Charge: $200.00
        System.out.println("Balance: " + visa.getBalance()); // Expected: $200.00

        System.out.println("Attempt to charge " + SECOND_AMOUNT);
        visa.charge(SECOND_AMOUNT); // Expected: Charge: $10.02
        System.out.println("Balance: " + visa.getBalance()); // Expected: $210.02

        System.out.println("Attempt to pay " + THIRD_AMOUNT);
        visa.pay(THIRD_AMOUNT); // Expected: Payment: $25.00
        System.out.println("Balance: " + visa.getBalance()); // Expected: $185.02

        System.out.println("Attempt to charge " + FOURTH_AMOUNT);
        visa.charge(FOURTH_AMOUNT); // Expected: Exceeds credit limit
        System.out.println("Balance: " + visa.getBalance()); // Expected: $185.02
    }
}
