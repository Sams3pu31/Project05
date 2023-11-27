package Task01;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        System.out.print("Введите температуру (целое число): ");

        int temperature = inputInt.nextInt();

        if (temperature < 0) {
            System.out.println("Сейчас очень холодно");
        } else if (temperature <= 16) {
            System.out.println("Сейчас прохладно");
        } else if (temperature <= 27){
            System.out.println("Отличный летний денек!");
        } else {
            System.out.println("Ищи тень, иначе обгоришь!");
        }
    }
}

