package ru.home.tests;

public class Application {
    public static void main(String[] args) {
        Matches matches = new Matches(Matches.MAX_MATCHES, Matches.FIRST_MOVE_MATCHES);
        Console console = new Console();

        console.currentMatchesReminderMessage(matches.getCurrentMatchesRemainder());
        matches.makeAMove();
        console.computerMovedMessage(matches.getMoveMatchesQuantity());

        while (matches.getCurrentMatchesRemainder() > 1) {
            console.currentMatchesReminderMessage(matches.getCurrentMatchesRemainder());
            matches.setMoveMatchesQuantity(console.getUserMatchesQuantity());
            matches.makeAMove();

            console.currentMatchesReminderMessage(matches.getCurrentMatchesRemainder());
            matches.setMoveMatchesQuantity(matches.findMatchesForNextMove());
            matches.makeAMove();
            console.computerMovedMessage(matches.getMoveMatchesQuantity());

            if (matches.getCurrentMatchesRemainder() == 1){
                console.gameOverMessage();
            }
        }
    }
}
