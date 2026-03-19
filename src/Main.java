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
            System.out.println("3 Update");
            System.out.println("4 Exit");

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
                    updateItem();
                    break;

            }

        } while (choice != 5);

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

        if (count == 0) {
            System.out.println("Empty");
            return;
        }

        for (int i = 0; i < count; i++) {
            items[i].display();
        }

    }





    static void updateItem() {

        System.out.print("Enter name: ");
        String name = input.nextLine();

        for (int i = 0; i < count; i++) {

            if (items[i].name.equalsIgnoreCase(name)) {

                System.out.print("New qty: ");
                int q = input.nextInt();
                input.nextLine();

                items[i].quantity = q;

                System.out.println("Updated");
                return;
            }
        }

        System.out.println("Not found");
    }

}