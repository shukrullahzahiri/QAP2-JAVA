public class Money implements Comparable<Money> {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public Money(Money other) {
        this.amount = other.amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return Double.compare(money.amount, amount) == 0;
    }

    @Override
    public int compareTo(Money other) {
        return Double.compare(this.amount, other.amount);
    }

    @Override
    public String toString() {
        return "$" + String.format("%.2f", amount);
    }
}
