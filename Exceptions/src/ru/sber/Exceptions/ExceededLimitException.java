package ru.sber.Exceptions;

public class ExceededLimitException extends BankOnlineException {
    public ExceededLimitException() {
        super("Превышен лимит на перевод. Максимальная сумма 50 000.");
    }
}