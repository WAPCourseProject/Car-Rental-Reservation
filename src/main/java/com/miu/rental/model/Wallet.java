package com.miu.rental.model;

import com.miu.rental.model.customAttributeType.*;

import java.time.LocalDate;

public class Wallet {
    private Client owner;
    private Enum<CardType> type;
    private String nameOnCard;
    private String cardNumber;
    private LocalDate expirationDate;
    private Integer code;

    public Wallet() {
    }

    public Wallet(Client owner, Enum<CardType> type, String nameOnCard, String cardNumber, LocalDate expirationDate, Integer code) {
        this.owner = owner;
        this.type = type;
        this.nameOnCard = nameOnCard;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.code = code;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public Enum<CardType> getType() {
        return type;
    }

    public void setType(Enum<CardType> type) {
        this.type = type;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
