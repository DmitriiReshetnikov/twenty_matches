package ru.home.tests;

import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);

    public void currentMatchesReminderMessage(int currentMatchesRemainder){
        System.out.println("На столе осталось " + currentMatchesRemainder + " спичек");
    }

    public int getUserMatchesQuantity(){
        int quantity;
        while (true){
            System.out.print(" - Ход игрока. Введите количество спичек: ");
            if (scanner.hasNextInt()){
                quantity = scanner.nextInt();
                if ((quantity >= 1) && (quantity < 4)) {
                    break;
                } else {
                    System.out.println("Вы ввели неверное значение. Попробуйте ещё раз!");
                }
            }else {
                scanner.next();
                System.out.println("Необходимо ввести число от 1-го до 3-х.");
            }
        }
    return quantity;
    }

    public void computerMovedMessage(int moveMatches){
        System.out.println(" - Количество выбранных компьютером спичек = " + moveMatches);
    }

    public void gameOverMessage(){
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
    }
}
