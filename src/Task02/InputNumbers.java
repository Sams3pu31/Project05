package Task02;

import java.util.Scanner;

public class InputNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int i = scanner.nextInt();

        String result = (i % 2 == 0) ? "чётное" : "нечётное";
        System.out.println("Число " + i + " является " + result + ".");
    }
}

