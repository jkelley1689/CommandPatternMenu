package Commands;
import Aggregator.*;

public class CMDGetMenu implements CMDInterface{
    private Aggregator agg;

    public CMDGetMenu(Aggregator agg){
        this.agg = agg;
    }

    @Override
    public Object execute(){
        return agg.getMenu(); // if copy constructor implemented
        // or
        // return agg.getMenu().clone(); // if clone method implemented
    }

}
