public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit);
        this.balance = new Money(0);
    }

    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        if (balance.getAmount() + amount.getAmount() > creditLimit.getAmount()) {
            System.out.println("Exceeds credit limit");
        } else {
            balance.setAmount(balance.getAmount() + amount.getAmount());
            System.out.println("Charge: " + amount);
        }
    }

    public void pay(Money amount) {
        balance.setAmount(balance.getAmount() - amount.getAmount());
        System.out.println("Payment: " + amount);
    }
}
