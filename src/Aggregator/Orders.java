package Aggregator;

public class Orders {

    private OrderItem[] orderItems;

    public Orders(){
        orderItems = new OrderItem[10];
        initOrder();
    }

    public void placeOrder(OrderItem newOrder){
        orderItems[findAvailIndex()] = newOrder;
        System.out.println();
    }

    private int findAvailIndex(){
        int i = 0;
        while(orderItems[i] != null && i < orderItems.length - 1)
            i++;

        return i;
    }

    public OrderItem[] getOrderItems(){
        return orderItems;
    }

    private void initOrder(){
        for(int i = 0; i < orderItems.length;i++){
            orderItems[i] = null;
        }
    }




}
