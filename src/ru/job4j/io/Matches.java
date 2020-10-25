package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int count = 11;
        Scanner input = new Scanner(System.in);
        while (count > 0) {
            System.out.println("Ход первого игрока");
            int playerOneMove = Integer.valueOf(input.nextLine());
            count = count - playerOneMove;
            System.out.println("Осталось " + count + " спичек");
            if (count == 0) {
                System.out.println("Победил первый игрок");
                break;
            }
            System.out.println("Ход второго игрока");
            int playerTwoMove = Integer.valueOf(input.nextLine());
            count = count - playerTwoMove;
            System.out.println("Осталось " + count + " спичек");
            if (count == 0) {
                System.out.println("Победил второй игрок");
            }
        }
    }
}
