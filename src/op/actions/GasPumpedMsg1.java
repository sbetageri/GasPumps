package op.actions;

import data.DataStore1;
import data.IDataStore;

public class GasPumpedMsg1 implements IGasPumpedMsg {

    @Override
    public void GasPumpedMsg(IDataStore iDataStore) {
        DataStore1 dataStore = (DataStore1) iDataStore;
        System.out.println(Integer.toString(dataStore.G) + " Gallons of fuel have been pumped");
    }
}
