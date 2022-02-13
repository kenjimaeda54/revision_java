package acount.savings;

import acount.Account;
import acount.Investment;


import java.text.NumberFormat;

public class Savings extends Account implements Investment {

    static final Float revenue = 1.05F;
    private float rate= 1.02F;

    NumberFormat real = NumberFormat.getInstance();

    public Savings() {

    }

    public Savings(Float rate) {
        this.rate = rate;
    }


    @Override
    public double deposit(double value) {
        balance += value;
        return balance;
    }

    @Override
    public double withdraw(double value) {
        balance = balance - (value * this.rate);
        return balance;
    }

    @Override
    public double calculateInvestment() {
        balance *= revenue;
        return balance;
    }

    public  String toString () {
        return +balance < 0 ?  "Exception you dont have balance sufficient": "Success your balance now is R$"+real.format(balance);
    }
}
