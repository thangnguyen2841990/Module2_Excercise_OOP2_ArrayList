package com.codegym;

import java.io.Serializable;

public class Bill implements Serializable {
    private int oldIndex;
    private int newIndex;
    private Customer customer;

    public Bill(int oldIndex, int newIndex, Customer customer) {
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        this.customer = customer;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int payMoney() {
        return (this.newIndex - this.oldIndex) * 750;
    }

    @Override
    public String toString() {
        return customer.toString() +
                ", chỉ số cũ: " + getOldIndex() + ", chỉ số mới: " + getNewIndex() + ", số tiền phải trả: " + payMoney() ;
    }
}
