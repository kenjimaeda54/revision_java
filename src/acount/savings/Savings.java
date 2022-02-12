package acount.savings;

import acount.Account;
import acount.Investment;

public class Savings extends Account implements Investment {


    final Float revenue;
    private float rate= 0.3F;


    public Savings(Float investment) {
        this.revenue = investment * 0.3F;
        this.rate = rate;
    }

    public Savings(Float investment, Float rate) {
        this.revenue = investment * 0.3F;
        this.rate = rate;
    }


    @Override
    public double deposit(double value) {
        balance += value;
        return balance;
    }

    @Override
    public double withdraw(double value) {
        balance = (balance - value) * this.rate;
        return balance;
    }

    @Override
    public double calculateInvestment(double investment) {
        balance *= revenue;
        return balance;
    }

    public  String toString () {
        return +balance < 0 ?  "Exception you dont have balance sufficient": "Success your balance now is R$"+balance;
    }
}
