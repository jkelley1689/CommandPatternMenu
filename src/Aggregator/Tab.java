package Aggregator;

public class Tab {

    private OrderItem[] newTab;

    public Tab(Orders orders){
        newTab = orders.getOrderItems();
    }

    public OrderItem getCurrentItem(int i){
        return newTab[i];
    }
}
