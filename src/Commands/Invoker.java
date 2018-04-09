package Commands;
import Aggregator.*;

public class Invoker {
    private static Aggregator agg = new Aggregator();

    public static Menu getMenu(){
        return (Menu) new CMDGetMenu(agg).execute();
    }

    public static Object placeOrder(int itemNum){
        return new CMDPlaceOrder(agg).execute(itemNum);
    }

    public static Tab getTab(){
        return(Tab) new CMDGetTab(agg).execute();

    }

}
