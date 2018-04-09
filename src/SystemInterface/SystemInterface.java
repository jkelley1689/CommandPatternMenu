package SystemInterface;

import Aggregator.*;
import Commands.CMDPlaceOrder;
import Commands.Invoker;


public class SystemInterface {


    public void getMenu() {
        Menu menu = Invoker.getMenu();

        menu.reset();
        while (menu.hasNext()) {
            System.out.println(menu.getNextItem().toString());
        }

    }

    public CMDPlaceOrder placeOrders(int itemNum) {
        return (CMDPlaceOrder) Invoker.placeOrder(itemNum);
    }

    public double getTab() {
        Boolean found;
        double total = 0;
        Tab tab = Invoker.getTab();
        Menu menu = Invoker.getMenu();

        int i = 0;
        while (tab.getCurrentItem(i) != null) {
            menu.reset();
            found = false;
            int num = tab.getCurrentItem(i).getItemNum();
            while (menu.hasNext() && !found) {
                if (menu.getItem().getItemNum() == num) {
                    total = total + menu.getItem().getPrice();
                    System.out.println(menu.getItem().toString());
                    found = true;
                } else
                    menu.getNextItem();
            }
            i++;
        }
        return total;
    }
}







