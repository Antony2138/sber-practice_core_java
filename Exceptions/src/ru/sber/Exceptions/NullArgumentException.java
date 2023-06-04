package ru.sber.Exceptions;

public class NullArgumentException extends BankOnlineException {
    public NullArgumentException(String argumentName) {
        super("Аргумент " + argumentName + " не может быть null.");
    }
}