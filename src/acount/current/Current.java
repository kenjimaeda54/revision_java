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
    public double deposit(double value) {
        return balance + value;
    }

    @Override
    public double withdraw(double value) {
        return value;
    }



}
