package com.codegym;

public class Customer {        //Customer
    private String name;
    private int apartmentNumber;    // sửa thành: address;
    private int meterCodeNumber;  //meterCode

    public Customer() {
    }

    public Customer(String name, int apartmentNumber, int meterCodeNumber) {
        this.name = name;
        this.apartmentNumber = apartmentNumber;
        this.meterCodeNumber = meterCodeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getMeterCodeNumber() {
        return meterCodeNumber;
    }

    public void setMeterCodeNumber(int meterCodeNumber) {
        this.meterCodeNumber = meterCodeNumber;
    }

    @Override
    public String toString() {
        return "Chủ hộ: " + getName() + ", Số nhà: " + getApartmentNumber() + ", Mã số công tơ: " + getMeterCodeNumber();
    }
}
