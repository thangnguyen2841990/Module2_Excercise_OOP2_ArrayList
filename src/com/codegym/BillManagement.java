package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
    public void addNewBill(Bill newBill) {
        bills.add(newBill);
    }
    // Xoá hết Bill
    public void removeAllBill(){
        bills.clear();
    }
    //Hiển thị biên lai
    public void displayAllBills() {
        for (int i = 0; i < bills.size(); i++) {
            System.out.println((i + 1) + ". " + bills.get(i));
        }
    }

    public void writeToFiles(String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Bill bill : bills) {
            fileWriter.write(bill.toString() + "\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }

    public void readFiles(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            String[] lines = line.split(",");
            String name = lines[0].trim();
            int apartmentNumber = Integer.parseInt(lines[1].trim());
            int meterCodeNumber = Integer.parseInt(lines[2].trim());
            Customer customer = new Customer(name, apartmentNumber, meterCodeNumber);
            int oldIndex = Integer.parseInt(lines[3].trim());
            int newIndex = Integer.parseInt(lines[4].trim());
            Bill bill = new Bill(oldIndex, newIndex, customer);
            this.bills.add(bill);
        }
        bufferedReader.close();
        fileReader.close();
    }

    public void writeToFile1(List<Bill> bills) throws IOException {
        OutputStream os = new FileOutputStream("bill1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(bills);
    }
    public void readFile1() throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream("bill1.txt");
        ObjectInputStream ois = new ObjectInputStream(is);
        this.bills = (ArrayList<Bill>) ois.readObject();
    }
}
