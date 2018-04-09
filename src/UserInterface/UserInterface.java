package UserInterface;

import SystemInterface.*;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args){
        openingMenu();
        menuChoices();
    }

    public static void openingMenu() {
        System.out.println();
        System.out.println("Welcome to Justin's");
        System.out.println("Please choose one of the following \n");
        System.out.println("1. View Menu");
        System.out.println("2. Place Order");
        System.out.println("3. View Tab");
        System.out.println("4. Exit");
    }

    public static void menuChoices(){
        SystemInterface sysInt = new SystemInterface();
        Scanner console = new Scanner(System.in);
        System.out.println(">>");
        int choice = console.nextInt();

        while(choice != 4){
            switch(choice){
                case 1:
                    sysInt.getMenu();
                    break;
                case 2:
                    System.out.println("Please select the item number of the item you wish to order");
                    int itemNum = console.nextInt();
                    sysInt.placeOrders(itemNum);
                    break;
                case 3:
                    double tab = sysInt.getTab();
                    System.out.println("Total: " + tab);
                    break;
            }
            openingMenu();
            choice = console.nextInt();
        }
        System.out.println("Thanks for visiting!!!!");
    }
}
