/* ***************************************************************************
This is a comment about the MAIN program.
*************************************************************************** */

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2; // 1 + 2 = 3
        /* 1 and 2 are operands, change to single operand if = 3. + and = are operators */
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; //remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        /* result = 5;
        result = result % 3; //remainder of (5 % 3) = 2
        System.out.println("5 % 3 = " + result); */

        // result = result + 1;
        result++; // 1+1=2
        System.out.println("1 + 1 = " + result);

        result--; // 2-1=1
        System.out.println("2 - 1 = " + result);

        // result = result + 1;
        result+= 2; // 1+2=3
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result*= 10; // 3*10=30
        System.out.println("3 * 10 = " + result);

        // result = result / 3;
        result/= 3; // 30/3=10
        System.out.println("30 / 3 = " + result);

        // result = result - 2;
        result-= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");
           /* isAlien = true;
        if (isAlien == true)
            System.out.println("It is an alien!"); */
        isAlien = false; // no code block so only 1 line of code after IF
        if (isAlien == true)
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!");

        isAlien = false; // no code block so only 1 line of code after IF
        if (isAlien == false) { // CODE BLOCK
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!");
        }

        int topScore = 80;
        if (topScore <= 100) { // ==, !=, >, >=, <, <=, XOR
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) { //Logical AND operator
            System.out.println("Greater than second top score and less than 100!");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        // Make sure you are using the is Equal operator and not the Assignment operator!

        int newValue = 50;
        /* if (newValue = 50) {
        System.out.println("This is an error"); */
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        /* if (isCar = true) {
            System.out.println("This is not suppose to happen but isCar is set to True"); */
        if (isCar == true) {
            System.out.println("This is corrected and will not return");
        }
        isCar = false;
        if (isCar) { //same as is True, != true means is False or == false
            System.out.println("This is corrected and will not return");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false; {
            if(wasCar)
                System.out.println("wasCar is true.");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;

        // Ternary Operator Precedence Challenge
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        // double myValuesTotal = myFirstValue + mySecondValue * 100.00d; I didn't make this mistake, :)
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        double theRemainder = (myValuesTotal % 40.00d);
        System.out.println("myValuesTotal = " + myValuesTotal);
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
