package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> menuItems;
    private LocalDateTime localDateTime;
    private String receiptFileName;



    public Order() {
        this.menuItems = new ArrayList<>();
        this.localDateTime = LocalDateTime.now();
        this.receiptFileName = "Receipts/" + localDateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"))+".txt";
    }

    public String getReceiptFileName() {
        return receiptFileName;
    }



    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public LocalDateTime getLocalDateTime(Order order) {
        return localDateTime;
    }

    public String getReceiptText(){
        StringBuilder receipt = new StringBuilder();

        receipt.append("                            Pizzeria" +"\n");
        receipt.append("────────────────────────────────────────────────────────────────────────" + "\n");
        receipt.append("Date: " + this.localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n");
        receipt.append("────────────────────────────────────────────────────────────────────────" + "\n");
        for (MenuItem m: menuItems){
            receipt.append(m.toString()).append("\n");
        }
        receipt.append("────────────────────────────────────────────────────────────────────────" + "\n");
        receipt.append(String.format("Total: %65.2f", getOrderTotal()));
        return receipt.toString();


    }

    public void addMenuItem(MenuItem menuItem){
        this.menuItems.add(menuItem);
    }

    //todo move this method into UI
    public void display() {
        for (MenuItem m : menuItems) {
            System.out.println(m);
        }

            System.out.printf("Current total: $%.2f%n", getOrderTotal());


    }


    public double getOrderTotal(){
        double orderTotal = 0;
        for (MenuItem m : menuItems){
            orderTotal +=m.getPrice();
        }
        return orderTotal;
    }



}
