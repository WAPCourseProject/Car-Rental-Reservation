package com.miu.rental.model;

import com.miu.rental.model.customAttributeType.CardType;

import java.io.Serializable;
import java.time.LocalDate;

public class PaymentCard  implements Serializable {
    private Client owner;
    private String type; // MADE CHANGES HERE ON TYPE
    private String nameOnCard;
    private String cardNumber;
    private LocalDate expirationDate;
    private Integer code;

    public PaymentCard() {
    }

    public PaymentCard(Client owner, String type, String nameOnCard, String cardNumber, LocalDate expirationDate, Integer code) { // MADE CHANGES HERE ON TYPE
        this.owner = owner;
        this.type = type.toUpperCase(); // MADE CHANGES HERE ON toUpperCase
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

    public String getType() {
        return type;
    } // MADE CHANGES HERE ON TYPE

    public void setType(String type) {
        this.type = type.toUpperCase();
    } // MADE CHANGES HERE ON TYPE and toUpperCase

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
