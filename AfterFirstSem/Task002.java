package Java.Homeworks.AfterFirstSem;

public class Task002 {
    public static void main(String[] args) {
        // Вывести все простые числа от 1 до 1000
        // Просто́е число́ — натуральное число, имеющее ровно два различных натуральных делителя.
            
        int i = 0;
        int divider = 0;
        String primeNumbers = "";  // Сохраняем найденные простые числа в виде строки

        for (i = 1; i <= 1000; i++) {
            int counter = 0;  

            for (divider = i; divider >= 1; divider--) {  
                if (i % divider == 0) {  
                    counter++;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime Numbers from 1 to 1000:");
        System.out.println(primeNumbers);


    }
}
