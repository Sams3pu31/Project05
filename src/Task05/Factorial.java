package Task05;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Введите целое, положительное число для вычисления факториала: ");
        int n = number.nextInt();

        if (n < 0) {
            System.out.println("Факториал отрицательного числа не определен!");
        } else if (n>31){
            System.out.println("Введите число до 31");
        }else{
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Факториал числа " + n + " равен " + factorial);
        }
    }
}
