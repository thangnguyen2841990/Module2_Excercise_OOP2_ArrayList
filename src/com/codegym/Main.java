package com.codegym;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        BillManagement billManagement = new BillManagement();
        try {
            billManagement.readFile1();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            if (choice > 2) {
                System.out.println("Menu chỉ có từ 1=>2");
            }
            switch (choice) {
                case 1: {
                    System.out.println("----Hiển thị thông tin biên lai----");
                    billManagement.displayAllBills();
                    if (billManagement.getBills().size() == 0) {
                        System.out.println("Không có biên lai để hiển thị!");
                    }
                    break;
                }
                case 2: {
                    System.out.println("----NHập biên lai----");
                    Bill newBill = inputNewBill();
                    billManagement.addNewBill(newBill);
                    System.out.println("Đã thêm biên lai thành công!");


                    break;
                }
                case 3 : {
                    System.out.println("----Xóa hết biên lai----");
                    billManagement.removeAllBill();
                    System.out.println("Đã xóa hết biên lai!");
                    break;
                }
            }
            try {
                billManagement.writeToFile1(billManagement.getBills());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (choice != 0);
    }

    public static void menu() {
        System.out.println("MENU QUẢN LÝ KHÁCH HÀNG: ");
        System.out.println("1. Hiển thị thông tin biên lai ");
        System.out.println("2. Nhập biên lai ");
        System.out.println("3. Xóa hết bien lai.");
        System.out.println("0. Thoát");

    }

    public static Bill inputNewBill() {
        scanner.nextLine();
        System.out.println("Nhập tên chủ hộ");
        String name = scanner.nextLine();
        System.out.println("Nhập số nhà: ");
        int address = scanner.nextInt();   // address
        System.out.println("Nhập mã số công tơ: ");
        int code = scanner.nextInt();
        System.out.println("Nhập chỉ số công tơ cũ: ");
        int oldIndex = scanner.nextInt();
        System.out.println("Nhập chỉ số công tơ mới: ");
        int newIndex = scanner.nextInt();
        return new Bill(oldIndex, newIndex, new Customer(name, address, code));
    }


}

