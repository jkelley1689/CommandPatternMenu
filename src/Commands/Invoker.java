package Commands;
import Aggregator.*;

public class Invoker {
    private static Aggregator agg = new Aggregator();

    public static Menu getMenu(){
        return (Menu) new CMDGetMenu(agg).execute();
    }

}
