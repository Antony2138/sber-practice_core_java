package ru.sber.Exceptions;

public class InvalidCardNumberException extends BankOnlineException {
    public InvalidCardNumberException() {
        super("Не верный номер карты. Он должен содержать ровно 16 цифр.");
    }
}

