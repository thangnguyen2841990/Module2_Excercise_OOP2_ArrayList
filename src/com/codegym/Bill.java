package com.codegym;

public class Bill {
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
        return "Thông tin về hộ sử dụng điện: " + customer.toString() + "\n" +
                "Chỉ số cũ: " + getOldIndex() + ", Chỉ số mới: " + getNewIndex() + ", Số tiền phải nộp: " + payMoney() + "(VND)";
    }
}
