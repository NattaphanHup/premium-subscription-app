package com.example.premiumapp.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Payment model representing a payment transaction
 */
public class Payment implements Serializable {
    private String paymentId;
    private String userId;
    private String subscriptionId;
    private double amount;
    private String currency;
    private String status; // pending, completed, failed, refunded
    private String paymentMethod; // google_play, credit_card, etc
    private String transactionId;
    private Date paymentDate;
    private Date createdAt;
    private String description;

    // Constructors
    public Payment() {}

    public Payment(String userId, String subscriptionId, double amount) {
        this.userId = userId;
        this.subscriptionId = subscriptionId;
        this.amount = amount;
        this.currency = "USD";
        this.status = "pending";
        this.paymentMethod = "google_play";
        this.createdAt = new Date();
    }

    // Getters and Setters
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", paymentDate=" + paymentDate +
                '}' ;
    }
}
