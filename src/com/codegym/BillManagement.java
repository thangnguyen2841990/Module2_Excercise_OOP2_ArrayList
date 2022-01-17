package com.codegym;

import java.util.ArrayList;

public class BillManagement {
    private ArrayList<Bill> bills;

    public BillManagement() {
        this.bills = new ArrayList<>();
    }

    public BillManagement(ArrayList<Bill> bills) {
        this.bills = bills;
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }
    //Nhập biên lai
    public void addNewBill(Bill newBill){
        bills.add(newBill);
    }
    //Hiển thị biên lai
    public void displayAllBills(){
        for (int i = 0; i < bills.size(); i++) {
            System.out.println((i+1)+". "+bills.get(i));
        }
    }
}
