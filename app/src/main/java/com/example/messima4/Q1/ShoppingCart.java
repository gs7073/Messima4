package com.example.messima4.Q1;

public class ShoppingCart {

    private Product[] products;
    private int count;

    public ShoppingCart() {
        products = new Product[10];
        count = 0;
    }

    public void addProduct(Product p) {
        if (count < 10) {
            products[count] = p;
            count++;
        } else {
            System.out.println("The cart is full!");
        }
    }

    public double calculateTotal() {
        double sum = 0;

        for (int i = 0; i < count; i++) {
            sum += products[i].getPrice();
        }

        return sum;
    }
}
