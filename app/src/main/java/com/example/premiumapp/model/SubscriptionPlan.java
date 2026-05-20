package com.example.premiumapp.model;

import java.io.Serializable;
import java.util.List;

/**
 * SubscriptionPlan model representing available subscription plans
 */
public class SubscriptionPlan implements Serializable {
    private String planId;
    private String name;
    private String description;
    private double monthlyPrice;
    private String currency;
    private int billingCycleDays;
    private List<String> features;
    private String skuId; // Google Play SKU ID
    private boolean isActive;
    private int maxUsers;
    private int priority;

    // Constructors
    public SubscriptionPlan() {}

    public SubscriptionPlan(String planId, String name, double monthlyPrice) {
        this.planId = planId;
        this.name = name;
        this.monthlyPrice = monthlyPrice;
        this.currency = "USD";
        this.billingCycleDays = 30;
        this.isActive = true;
        this.maxUsers = 1;
    }

    // Getters and Setters
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(double monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getBillingCycleDays() {
        return billingCycleDays;
    }

    public void setBillingCycleDays(int billingCycleDays) {
        this.billingCycleDays = billingCycleDays;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "SubscriptionPlan{" +
                "planId='" + planId + '\'' +
                ", name='" + name + '\'' +
                ", monthlyPrice=" + monthlyPrice +
                ", currency='" + currency + '\'' +
                '}' ;
    }
}
