package acount.current;

import acount.Account;
import acount.Type;

import static acount.Type.COMMON;


public class Current extends Account {


    Type type;

    public Current() {

    }

    public Current(String type) {
       this.type = Type.valueOf(type);
    }

    @Override
    public double deposit(double value) {
        balance += value;
        return balance;
    }

    @Override
    public double withdraw(double value) {
        balance -= value;
        return balance;
    }

    public  String  toString() {
        return +balance < 0 && type == COMMON ?  "Exception you dont have balance sufficient": "Success your balance now is R$ "+balance;

    }


}
