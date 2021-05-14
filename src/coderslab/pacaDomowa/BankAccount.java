package coderslab.pacaDomowa;

public class BankAccount {
    private int number;
    private double cash;

    public int getNumber() {
        return number;
    }

    public double getCash() {
        return cash;
    }


    public BankAccount(int number) {
        this.number = number;
        this.cash = 0;
    }

    public void depositCash(double amount) {
        if (amount > 0) {
            this.cash += amount;
        } else {
            System.out.println("Niniejsza operacja służy do wpłacania pieniędzy. Kwota wpłaty nie może być ujemna lub zerowa.");

        }
    }

    public double withdrawCash(double amount) {
        if (amount <= 0) {
            System.out.println("Niniejsza operacja służy do wypłacania pieniędzy. Kwota wypłaty nie może być ujemna lub zerowa.");
            return this.cash;
        } else {
            if (amount > this.cash) {
                amount = this.cash;
                this.cash = 0;
                return amount;

            } else {
                this.cash -= amount;
                return amount;
            }
        }
    }

    public String printInfo (){
        return "Na koncie o nr: " + this.number + " znajdują się następujące środki: " + this.cash + " PLN.";

    }
}
