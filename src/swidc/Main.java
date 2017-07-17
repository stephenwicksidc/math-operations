package swidc;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        String firstInputNumber;
        String secondInputNumber;
        Double sum;
        Double difference;
        Double division;
        Double multiplication;
        Double remainder;


        Scanner input = new Scanner(System.in);

            System.out.println("Hello.  Please enter your first number.");
            firstInputNumber = input.nextLine();


        System.out.println("Hello.  Please enter your second number.");
        secondInputNumber = input.nextLine();

        Double operand1 = Double.parseDouble(firstInputNumber);
        Double operand2 = Double.parseDouble(secondInputNumber);

        sum = operand1 + operand2;


        difference = operand1 - operand2;


        division  = operand1 / operand2;


        multiplication = operand1 * operand2;


        remainder = operand1 % operand2;

        showResults(sum, difference, division, multiplication, remainder);




    }
    public static void showResults(double sumNum, double differenceNum, double divisionNum, double multiplicationNum, double remainderNum){


        System.out.println("The sum is " + sumNum);
        System.out.println("The difference is " + differenceNum);
        System.out.println("The quotient is " + divisionNum);
        System.out.println("The product is " + multiplicationNum);
        System.out.println("The remainder is " + remainderNum);

    }

    }

