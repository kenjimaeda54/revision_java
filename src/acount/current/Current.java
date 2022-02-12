package acount.current;

import acount.Account;
import acount.Type;

import static acount.Type.COMMON;


public class Current extends Account {


    Type type;

    Current() {

    }

    Current(String type) {
       this.type = Type.valueOf(type);
    }

    @Override
    public String deposit(double value) {
        double total = balance + value;
        return "Success balance current is R$"+total;
    }

    @Override
    public String withdraw(double value) {
        double total = balance - value;
        if(total < 0  && type == COMMON ){
           return "Exception,you dont have balance sufficient";
        }
        return "Withdraw with success. Balance R$"+total;
    }

}
