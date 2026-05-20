package com.example.premiumapp.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Subscription model representing user's active subscription
 */
public class Subscription implements Serializable {
    private String subscriptionId;
    private String userId;
    private String planId;
    private String planName;
    private String status; // active, cancelled, expired, paused
    private Date startDate;
    private Date expiryDate;
    private Date nextBillingDate;
    private String autoRenew; // true or false
    private double currentPrice;
    private String currency;
    private String orderId;
    private String packageName;
    private int paymentCount;
    private Date lastPaymentDate;
    private String cancellationReason;
    private Date cancellationDate;

    // Constructors
    public Subscription() {}

    public Subscription(String userId, String planId, String planName) {
        this.userId = userId;
        this.planId = planId;
        this.planName = planName;
        this.status = "active";
        this.startDate = new Date();
        this.autoRenew = "true";
        this.paymentCount = 0;
    }

    // Getters and Setters
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getNextBillingDate() {
        return nextBillingDate;
    }

    public void setNextBillingDate(Date nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
    }

    public String getAutoRenew() {
        return autoRenew;
    }

    public void setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int getPaymentCount() {
        return paymentCount;
    }

    public void setPaymentCount(int paymentCount) {
        this.paymentCount = paymentCount;
    }

    public Date getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(Date lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    public String getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public Date getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(Date cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    public boolean isActive() {
        return "active".equals(status);
    }

    public boolean isExpired() {
        if (expiryDate != null) {
            return expiryDate.before(new Date());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "subscriptionId='" + subscriptionId + '\'' +
                ", planName='" + planName + '\'' +
                ", status='" + status + '\'' +
                ", expiryDate=" + expiryDate +
                '}' ;
    }
}
