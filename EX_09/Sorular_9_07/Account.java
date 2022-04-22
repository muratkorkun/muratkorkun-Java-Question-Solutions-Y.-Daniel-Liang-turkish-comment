package Bolum09BenimYazdiklarim.Sorular_9_07;

import java.util.Date;

/** Account
 * ------------------------------------
 * -id: int
 * -balance: double
 * -annualInterestRate: double
 * -dateCreated: Date
 * ------------------------------------
 * Account()
 * Account(id: int, balance: double)
 * +getId(): int
 * +getBalance(): double
 * +getAnnualInterestRate(): double
 * +getDateCreated(): Date
 * +setId(id: int): void
 * +setBalance(balance: int): void
 * +setAnnualInterestRate(annualInterestRate: double): void
 * +getMonthlyInterestRate(): double
 * +getMonthlyInterest(): double
 * +withdraw(amount: double): boolean
 * +deposit(amount: double): void
 * ------------------------------------
 * 
 * @author Amadeusz
 *
 */
public class Account {

    private int id;

    private double balance;

    private double annualInterestRate;

    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;

    }

    public Account(int newId, double newBalance) {

        this.id = newId;
        this.balance = newBalance;
        dateCreated = new Date();
        annualInterestRate = 0;
    }

    public int getID() {

        return id;
    }

    public void setID(int newID) {

        this.id = newID;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double newBalance) {

        this.balance = newBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double newInterestRate) {

        this.annualInterestRate = newInterestRate;
    }

    public Date getDateCreated() {

        Date startDate = dateCreated;

        return startDate;
    }

    public double getMonthlyInterestRate() {

        double InterestRatePerMonth = (annualInterestRate / 12);

        return InterestRatePerMonth;
    }

    public double getMonthlyInterest() {

        double monthlyInterest = balance * (this.getMonthlyInterestRate() / 100);

        return monthlyInterest;
    }

    public void withdraw(double amount) {

        balance -= amount;
    }

    public void deposit(double amountDeposit) {

        balance += amountDeposit;

    }

    @Override
    public String toString() {

        return "\nAccount ID: " + getID() + "\nBalance: " + getBalance() +
                "\nDate created " + getDateCreated();
    }
}