package ru.sber.Exceptions;

public class NegativeAmountException extends BankOnlineException {
    public NegativeAmountException() {
        super("Превода должна быть положительный.");
    }
}