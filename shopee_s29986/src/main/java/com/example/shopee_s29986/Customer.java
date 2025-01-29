package com.example.shopee_s29986;

public class Customer {
    private int customerID;
    private double balance;

    public Customer(int customerID, double balance) {
        this.customerID = customerID;
        this.balance = balance;
    }

    public int getCustomerID() {
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
