package acount;

import java.util.Calendar;

//classe abstrata
public abstract class Account {

     private int agency;
     private int number;
     private Calendar dateOPen;
     protected double balance;

     //construtor padrao
     public  Account(){

     }

     //construtor com todos os parametros
     public  Account(int agency,int number,Calendar dateOPen,double balance){
         this.agency = agency;
         this.number = number;
         this.dateOPen = dateOPen;
         this.balance = balance;
     }

     public abstract    String  deposit(double value);
     public abstract    String   withdraw(double value);


}
