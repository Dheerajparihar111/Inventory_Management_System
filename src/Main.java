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
            System.out.println("3 Exit");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    addItem();
                    System.out.println("Item Added Successfully");
                    break;

                case 2:
                    viewItem();
                    break;
                case 3:
                    System.out.println("Thank You For Using Inventory Management System");
                    System.exit(0);
            }

        } while (choice != 3);

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
        input.nextLine();

        p.setData(name, q);

        items[count] = p;
        count++;

    }


    static void viewItem() {

        for (int i = 0; i < count; i++) {
            items[i].display();
        }

    }

}