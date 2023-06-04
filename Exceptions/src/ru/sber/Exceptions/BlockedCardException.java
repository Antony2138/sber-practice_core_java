package ru.sber.Exceptions;

public class BlockedCardException extends BankOnlineException {
    public BlockedCardException() {
        super("Перевод денег на заблокированные карты запрещен.");
    }
}