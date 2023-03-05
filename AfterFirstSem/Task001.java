package Java.Homeworks.AfterFirstSem;

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        // Первое треугольное число - 1, второе - 3, третье - 6, четвертое - 10 и так далее. Формула для вычисления n-го треугольного числа: n*(n+1)/2
        System.out.print("Enter the triangular number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int trianglenumber = number*(number+1)/2;

        System.out.printf("Triangle number %d equals %d\n", number, trianglenumber);
        scanner.close();
    }
}
