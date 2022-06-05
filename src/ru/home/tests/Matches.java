package ru.home.tests;

public class Matches {
    static final int MAX_MATCHES = 20;
    static final int FIRST_MOVE_MATCHES = 3;

    private int currentMatchesRemainder;
    private int moveMatchesQuantity;

    public Matches(int currentMatchesRemainder, int moveMatchesQuantity) {
        this.currentMatchesRemainder = currentMatchesRemainder;
        this.moveMatchesQuantity = moveMatchesQuantity;
    }

    public int getCurrentMatchesRemainder() {
        return currentMatchesRemainder;
    }

    public void setMoveMatchesQuantity(int moveMatchesQuantity) {
        this.moveMatchesQuantity = moveMatchesQuantity;
    }

    public void makeAMove(){
        this.currentMatchesRemainder -= this.moveMatchesQuantity;
    }

    public int findMatchesForNextMove(){
        return (4 - this.moveMatchesQuantity);
    }

    public void printCurrentMatchesReminder(){
        System.out.println("На столе осталось " + this.currentMatchesRemainder + " спичек");
    }

    public void computerMove(){
        this.makeAMove();
        System.out.println(" - Количество выбранных компьютером спичек = " + this.moveMatchesQuantity);
    }

    public void userMove(){
        this.makeAMove();
    }
}
