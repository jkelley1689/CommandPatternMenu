package Commands;
import Aggregator.*;

public class CMDPlaceOrder implements CMDInterface{
    private Aggregator agg;

    public CMDPlaceOrder(Aggregator agg) {
        this.agg = agg;
    }

    public Object execute(int itemNum){
        agg.placeOrder(itemNum);
        return null;
    }

    @Override
    public Object execute() {
        return null;
    }
}
