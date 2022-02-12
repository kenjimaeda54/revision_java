package acount.savings;

import acount.Account;
import acount.Investment;

public class Savings extends Account implements Investment {


    final Float revenue;
    private float rate;

    public Savings(Float investment, Float rate) {
        this.revenue = investment * 0.3F;
        this.rate = rate;
    }
    

    @Override
    public String deposit(double value) {
        return "";
    }

    @Override
    public String withdraw(double value) {
        double total = (balance - value) * this.rate;
        if(total < 0 ){
            return "Exception,you dont have balance sufficient";
        }
        return "Success,your balance current is R$"+total;
    }

    @Override
    public String calculateInvestment(double investment) {
        double total = balance * revenue;
        return "Success, now you have total balance R$"+total;
    }
}
