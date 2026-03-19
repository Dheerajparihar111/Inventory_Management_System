import java.util.*;

public class Main {

    static Product[] items = new Product[10];
    static int count = 0;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== INVENTORY =====");
            System.out.println("1 Add");
            System.out.println("2 View");
            System.out.println("3 Search");
            System.out.println("4 Update");
            System.out.println("5 Remove");
            System.out.println("6 Exit");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    addItem();
                    break;

                case 2:
                    viewItem();
                    break;

                case 3:
                    searchItem();
                    break;

                case 4:
                    updateItem();
                    break;

                case 5:
                    removeItem();
                    break;

            }

        } while (choice != 6);

    }


    static void addItem() {

        if (count >= 10) {
            System.out.println("Full");
            return;
        }

        Product p = new Product();

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Qty: ");
        int q = input.nextInt();

        System.out.print("Price: ");
        double price = input.nextDouble();
        input.nextLine();

        p.setData(name, q, price);

        items[count] = p;
        count++;

    }


    static void viewItem() {

        if (count == 0) {
            System.out.println("Empty");
            return;
        }

        for (int i = 0; i < count; i++) {
            items[i].display();
        }

    }


    static void searchItem() {

        System.out.print("Enter name: ");
        String name = input.nextLine();

        for (int i = 0; i < count; i++) {

            if (items[i].name.equalsIgnoreCase(name)) {

                items[i].display();
                return;
            }
        }

        System.out.println("Not found");
    }


    static void updateItem() {

        System.out.print("Enter name: ");
        String name = input.nextLine();

        for (int i = 0; i < count; i++) {

            if (items[i].name.equalsIgnoreCase(name)) {

                System.out.print("New qty: ");
                int q = input.nextInt();

                System.out.print("New price: ");
                double p = input.nextDouble();
                input.nextLine();

                items[i].quantity = q;
                items[i].price = p;

                System.out.println("Updated");
                return;
            }
        }

        System.out.println("Not found");
    }


    static void removeItem() {

        System.out.print("Enter name: ");
        String name = input.nextLine();

        for (int i = 0; i < count; i++) {

            if (items[i].name.equalsIgnoreCase(name)) {

                for (int j = i; j < count - 1; j++) {
                    items[j] = items[j + 1];
                }

                count--;

                System.out.println("Removed");
                return;
            }
        }

        System.out.println("Not found");
    }

}