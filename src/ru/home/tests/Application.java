package ru.home.tests;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matches matches = new Matches(Matches.MAX_MATCHES, Matches.FIRST_MOVE_MATCHES);
        matches.printCurrentMatchesReminder();
        matches.computerMove();
        while (matches.getCurrentMatchesRemainder() > 1) {
            matches.printCurrentMatchesReminder();
            while (true){
                System.out.print(" - Ход игрока. Введите количество спичек: ");
                if (scanner.hasNextInt()){
                    int quantity = scanner.nextInt();
                    if ((quantity >= 1) && (quantity < 4)) {
                        matches.setMoveMatchesQuantity(quantity);
                        break;
                    } else {
                        System.out.println("Вы ввели неверное значение. Попробуйте ещё раз!");
                    }
                }else {
                    scanner.next();
                    System.out.println("Необходимо ввести число от 1-го до 3-х.");
                }
            }
            matches.userMove();
            matches.setMoveMatchesQuantity(matches.findMatchesForNextMove());
            matches.printCurrentMatchesReminder();
            matches.computerMove();
            if (matches.getCurrentMatchesRemainder() == 1){
                System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
            }
        }
    }
}
