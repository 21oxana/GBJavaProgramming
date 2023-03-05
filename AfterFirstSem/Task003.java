package Java.Homeworks.AfterFirstSem;

import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {
        // Реализовать простой калькулятор

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstnumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondnumber = scanner.nextDouble();

        System.out.print("Enter the sign (+, -, *, /): ");
        char sign = scanner.next().charAt(0);

        double result = 0;

        switch(sign) {
            case '+':
                result = firstnumber + secondnumber;               
                break;
            case '-':
                result = firstnumber - secondnumber;
                break;
            case '*':
                result = firstnumber * secondnumber;
                break;
            case '/':
                if (secondnumber == 0) {
                    System.out.println("Can't divide by zero");
                    System.exit(0); // без нее вывод 5.0 / 0.0 = Infinity
                }
                result = firstnumber / secondnumber;
                break;

            default:
                break;            
        }
        System.out.println(firstnumber + " " + sign + " " + secondnumber + " = " + result);
        scanner.close();
    }

}
