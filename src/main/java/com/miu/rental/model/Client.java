package com.miu.rental.model;

import com.miu.rental.model.customAttributeType.CardType;
import com.miu.rental.model.customAttributeType.Role;

import java.time.LocalDate;
import java.util.ArrayList;

public class Client extends User {
    private Address address;
    private String phoneNumber;
    private String licenceNumber;
    private String status; //active, frozen, premium
    private ArrayList<PaymentCard> wallet;

    public Client() {
        super();
    }

    public Client(String phoneNumber, String licenceNumber, String status) {
        this.address = new Address();
        this.phoneNumber = phoneNumber;
        this.licenceNumber = licenceNumber;
        this.status = status;
    }

    public Client(String fileName, String lastName, String userName, String password, String email, Enum<Role> role) {
        super(fileName, lastName, userName, password, email, role);
        this.status = "active";
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Address getAddress() {
        return address;
    }

    public ArrayList<PaymentCard> getWallet(){
        return wallet;
    }

    protected Boolean isEmptyWallet(){
        if(wallet.size() == 0){
            return true;
        }
        return false;
    }
    public PaymentCard getPaymentCard(String cardNumber){
        if(!isEmptyWallet()){
            for(PaymentCard card:wallet){
                if(card.getCardNumber().compareTo(cardNumber) == 0){
                    return card;
                }
            }
        }
        return null;
    }

    public Integer getPaymentCardIndx(String cardNumber){
        if(!isEmptyWallet()){
            for(int i = 0; i < wallet.size(); i++){
                PaymentCard card = wallet.get(i);
                if(card.getCardNumber().compareTo(cardNumber) == 0){
                    return i;
                }
            }
        }
        return null;
    }

    public Boolean addCardToWallet(Enum<CardType> type, String nameOnCard, String cardNumber, LocalDate expirationDate, Integer code){

        PaymentCard card = getPaymentCard(cardNumber);
        if(card != null){
            System.out.println("card already exists");
            return false;
        }
        PaymentCard newCard = new PaymentCard(this, type, nameOnCard, cardNumber, expirationDate, code);
        wallet.add(newCard);
        return true;

    }

    public Boolean removeCardFromWallet(String cardNumber){

        Integer indx = getPaymentCardIndx(cardNumber);
        if(indx != null){
            wallet.remove(indx);
            return true;
        }
        return false;
    }
}
