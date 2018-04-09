package Aggregator;

public class Aggregator {

    private Menu menu;
    private Orders orders;

    public Aggregator(){
        menu = new Menu();
        populateMenu();

        orders = new Orders();
    }

    public Menu getMenu(){
        return menu;
    }

    public Orders getOrders() {
        return orders;
    }

    public void placeOrder(int itemNum){
        orders.placeOrder(new OrderItem(itemNum));
    }



    //private methods

    private void populateMenu(){
        menu.addItem(new MenuItem(1,"Roast Beef",12.99));
        menu.addItem(new MenuItem(2,"Turkey Dinner",9.99));
        menu.addItem(new MenuItem(3,"Pizza",7.99));
        menu.addItem(new MenuItem(4,"BLT",8.99));
        menu.addItem(new MenuItem(5,"Chicken Tenders",8.99));
        menu.addItem(new MenuItem(6,"Chicken Parm",14.99));
        menu.addItem(new MenuItem(7,"Caesar Salad",10.99));
        menu.addItem(new MenuItem(8,"Spaghetti w/ Meatballs",11.50));
        menu.addItem(new MenuItem(9,"Cheeseburger",9.99));
        menu.addItem(new MenuItem(10,"Salmon",17.99));
        //add more
    }
}
