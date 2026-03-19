class Product {

    String name;
    int quantity;

    void setData(String n, int q) {
        name = n;
        quantity = q;
    }

    void display() {
        System.out.println(name + " - " + quantity);
    }
}