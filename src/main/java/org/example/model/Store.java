package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Milka", 50.0, "Sütlü Çikolata", 100);
        products[1] = new Coke("Coca Cola", 35.0, "Soğuk İçecek", true); // Diet olsun
        products[2] = new Bread("Halk Ekmek", 10.0, "Taze Ekmek", "Tam Buğday");


        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {

        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }
    }
}