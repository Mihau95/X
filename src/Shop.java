class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("Woda", "Żywiec", 2.0);
        product1.nazwa = "Woda";
        product1.producent = "Żywiec";
        product1.cena = 2.0;

        System.out.println(product1.nazwa);
        System.out.println(product1.producent);
        System.out.println(product1.cena);


        Product product2 = new Product("Czekolada", "Wedel", 3.5);


        System.out.println(product2.nazwa);
        System.out.println(product2.producent);
        System.out.println(product2.cena);


        Product product3 = new Product("Platki", "Nestle", 14.0);

        System.out.println(product3.nazwa);
        System.out.println(product3.producent);
        System.out.println(product3.cena);

//        Product product3 = new Product("Platki", "Nestle", 14.0);
//        Product product4 = product3;


    }
}
