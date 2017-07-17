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
        System.out.println("The sum is " + sum);

        difference = operand1 - operand2;
        System.out.println("The difference is " + difference);

        division  = operand1 / operand2;
        System.out.println("The quotient is " + division);

        multiplication = operand1 * operand2;
        System.out.println("The product is " + multiplication);

        remainder = operand1 % operand2;
        System.out.println("The remainder is " + remainder);



    }
    public static void showResults(double sum, double difference, double division, double multiplication, double remainder){
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(division);
        System.out.println(multiplication);
        System.out.println(remainder);

    }

    }

