import acount.current.Current;
import acount.savings.Savings;

import java.awt.*;


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
