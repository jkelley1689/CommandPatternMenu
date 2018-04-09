package Commands;
import Aggregator.*;

public class CMDGetTab implements CMDInterface{
    private Aggregator agg;

    public CMDGetTab(Aggregator agg){
        this.agg = agg;
    }

    @Override
    public Object execute() {
        return new Tab(agg.getOrders());

    }
}
