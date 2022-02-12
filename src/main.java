import acount.current.Current;

import java.awt.*;


public class main {
    public static void main(String[] args) {
        Current  currentOne = new Current("COMMON");
        Current  currentTwo = new Current("SPECIAL");
        Current  currentThree = new Current("COMMON");
        Current  currentFour = new Current("PREMIUM");
        

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


    }
}
