import java.awt.*;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit) {
            System.out.println("Enter your Choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchforItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }

    }

    public static void printInstruction() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice option");
        System.out.println("\t 1 - To print list of groceryiteams");
        System.out.println("\t 2 - To add an item to list");
        System.out.println("\t 3 - To modifyitem an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - Search for item in the list");
        System.out.println("\t 6 - quit the application");
    }

    public static void addItem() {
        System.out.print("please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter Item Number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Replacment item : ");
        String newItem = scanner.nextLine();
        groceryList.modifiedgrocrtylist(itemNo - 1, newItem);
    }

    public static void removeItem() {
        System.out.print("Remove Item Number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeItem(itemNo - 1);

    }

    public static void searchforItem() {
        System.out.print("Item to search for : ");
        String searchforitem = scanner.nextLine();
        if (groceryList.Finditem(searchforitem) != null) {
            System.out.println("found " + searchforitem + "in our grocery list");
        } else {
            System.out.println(searchforitem + "is not found in the list");
        }

    }

}
