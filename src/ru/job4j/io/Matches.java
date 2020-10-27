package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int count = 11;
        int number;
        int i = 0;
        Scanner input = new Scanner(System.in);
        while (count > 0) {
            if (i % 2 == 0) {
                System.out.println("Ход первого игрока");
            } else {
                System.out.println("Ход второго игрока");
            }
            number = Integer.valueOf(input.nextLine());
            if (number > 0 && number <= 3) {
                count = count - number;
                i++;
            } else {
                System.out.println("Значение должно быть от 1 до 3, повторите ход");
            }
            System.out.println("Осталось " + count + " спичек");
            if (i % 2 != 0 && count <= 0) {
                System.out.println("Победил первый игрок");
            } else if (i % 2 == 0 && count <= 0) {
                System.out.println("Победил второй игрок");
            }
        }
    }
}
