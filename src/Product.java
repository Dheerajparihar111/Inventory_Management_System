class Product {

    String name;
    int quantity;
    double price;

    void setData(String n, int q, double p) {
        name = n;
        quantity = q;
        price = p;
    }

    void display() {

        double total = quantity * price;

        System.out.println(
                name +
                        " | Qty: " + quantity +
                        " | Price: " + price +
                        " | Total: " + total
        );
    }
}