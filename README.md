# Exercises revision Java
Revisao dos conteudos de sobrecarga, interfaces, heranca, encapsulamento.



## Feature
- Criei uma classe que serviu de herança para Conta corrente e conta poupança.
- Vantagem de criar uma classe que serve de base para outras, diminuo a quantidade de código e reaproveito seus métodos
- balance,agency,number, são atributos disponíveis em qualquer classe que herda de Account
- Balance que esta no savings é mesmo balance que esta na classe Account, não preciso usar o this, porque com this vou referenciar o escopo dessa classe e não a que eta herdando

``` java
Account

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

     public abstract    double  deposit(double value);
     public abstract    double   withdraw(double value);


}

//==================================================//

//classe savings
public class Savings extends Account implements Investment {
@Override
public double withdraw(double value) {
        balance = balance - (value * this.rate);
        return balance;
    }

}
```

##
- Usei sobrecarga de métodos, vantagem de usar este recurso  consigo resultados diferentes na mesma classe
- Na instância savingsThree vou possuir resultados diferentes nas instância savingsOne e savingsTwo, isto se da por questão de sobrecarga de métodos
- Classe Savings tem um construtor padrão e um construtor com o atributo rate
- Caso use o contrutor padrao o rate ja possui valor definido
- Interfaces são contratos obrigados a cumprir, neste caso obriguei usar o método calculeInvetiment para as classes que implementava a  interface Investiment



``` java


public class main {
    public static void main(String[] args) {
        Current  currentOne = new Current("COMMON");
        Current  currentTwo = new Current("SPECIAL");
        Current  currentThree = new Current("COMMON");
        Current  currentFour = new Current("PREMIUM");

        Savings  savingsOne =  new Savings();
        Savings  savingsTwo =  new Savings();
        Savings  savingsThree = new Savings(1.03F);

        currentOne.deposit(10.2);
        currentOne.withdraw(20);
        System.out.println(currentOne);

        currentTwo.deposit(20.3);
        currentTwo.withdraw(25.3);
        System.out.println(currentTwo);

        currentThree.deposit(15.3);
        currentThree.withdraw(10.3);
        System.out.println(currentThree);

        currentFour.deposit(15.3);
        currentFour.withdraw(13.3);
        System.out.println(currentFour);
        System.out.println();

        savingsOne.deposit(25.3);
        savingsOne.withdraw(3.2);
        System.out.println(savingsOne);

        savingsTwo.deposit(20);
        savingsTwo.withdraw(5);
        System.out.println(savingsTwo);

        savingsThree.deposit(30);
        savingsThree.withdraw(5);
        System.out.println(savingsThree);


    }
}


//===================================//
//savgins
public class Savings extends Account implements Investment {
public Savings() {

    }

    public Savings(Float rate) {
        this.rate = rate;
    }

    @Override
    public double calculateInvestment() {
        balance *= revenue;
        return balance;
    }


}
```
##

- Outro recurso interesante usado foi os [Enum](https://www.devmedia.com.br/tipos-enum-no-java/25729)
- Com eles consigo limitar posibilidades de certos valores
- Exemplo abaixo foi feito uma logica para distinguir os tipos de contratos do banco, sejam eles contratos comum,especial e premio
- No contrato comum nao aceitava saldos negativos
- Para java enum não  são strings, para poder usar eles como string  tem recurso "valueof"
- Para inicializar meus Enum classe usei um construtor com parâmetro do tipo da conta.
- Caso não for passado nenhum valor no construtor, meu Enum sera considerado Commum
- Boa prática determinar valores padrões para suas variáveis, caso não fizer java vai assumir seus proprios valores. - - -Exemplo de string são nulos, numeros 0 e boolean false
- Nesta classe os Enum são importante para determinar se possível sacar ou não com saldo negativo, sem determinar valor padrão para Enum posso ter comportamentos inesperados
- Repara que a instância no main esta sendo usado em maiúsculo idêntico ao Enum, COMMON,SPECIAL,PREMIUM

``` java

public class Current extends Account {

    Type type = COMMON;

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


//enum 

public enum Type {
    COMMON,SPECIAL,PREMIUM
}


//main
public class main {
    public static void main(String[] args) {
        Current  currentOne = new Current("COMMON");
        Current  currentTwo = new Current("SPECIAL");
        Current  currentThree = new Current("COMMON");
        Current  currentFour = new Current("PREMIUM");
        Current  currentFive  = new Current();

        Savings  savingsOne =  new Savings();
        Savings  savingsTwo =  new Savings();
        Savings  savingsThree = new Savings(1.03F);




        currentOne.deposit(10.2);
        currentOne.withdraw(20);
        System.out.println(currentOne);

        currentTwo.deposit(20.3);
        currentTwo.withdraw(25.3);
        System.out.println(currentTwo);

        currentThree.deposit(15.3);
        currentThree.withdraw(10.3);
        System.out.println(currentThree);

        currentFour.deposit(15.3);
        currentFour.withdraw(13.3);
        System.out.println(currentFour);

        currentFive.deposit(10);
        currentFive.withdraw(50);
        System.out.println(currentFive);
        System.out.println();

        savingsOne.deposit(25.3);
        savingsOne.withdraw(3.2);
        System.out.println(savingsOne);

        savingsTwo.deposit(20);
        savingsTwo.withdraw(5);
        System.out.println(savingsTwo);

        savingsThree.deposit(30);
        savingsThree.withdraw(5);
        System.out.println(savingsThree);


    }
}


```
##
- Usei constantes em java, elas são imutáveis, então assim que inicializo preciso determinar um valor


``` java


 static final Float revenue = 1.05F;
 
 
 ```







