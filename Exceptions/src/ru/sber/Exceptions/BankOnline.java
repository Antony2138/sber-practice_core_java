package ru.sber.Exceptions;

import java.util.HashSet;
import java.util.Set;

public class BankOnline {
    private static final Set<String> BLOCKED_CARDS = new HashSet<>();
    private static final double TRANSFER_LIMIT = 50000;

    static {
        BLOCKED_CARDS.add("1111111111111111");
        BLOCKED_CARDS.add("2222222222222222");
        BLOCKED_CARDS.add("3333333333333333");
    }

    public void send(String cardNumber, Double money) throws BankOnlineException {
        // Проверка на null-аргументы
        if (cardNumber == null) {
            throw new NullArgumentException("Card number");
        }
        if (money == null) {
            throw new NullArgumentException("Money");
        }

        // Проверка корректности номера карты
        if (!cardNumber.matches("\\d{16}")) {
            throw new InvalidCardNumberException();
        }

        // Проверка, что карта не заблокирована
        for (String blockedCard : BLOCKED_CARDS) {
            if (blockedCard.equals(cardNumber)) {
                throw new BlockedCardException();
            }
        }
        // Проверка, что сумма перевода не отрицательная
        if (money < 0) {
            throw new NegativeAmountException();
        }

        // Проверка, что сумма перевода не превышает лимит
        if (money > TRANSFER_LIMIT) {
            throw new ExceededLimitException();
        }
    }
}