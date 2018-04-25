package op.actions;

import data.DataStore2;
import data.IDataStore;

public class GasPumpedMsg2 implements IGasPumpedMsg {

    @Override
    public void GasPumpedMsg(IDataStore iDataStore) {
        DataStore2 dataStore = (DataStore2) iDataStore;
        System.out.println(Integer.toString(dataStore.L) + " Liters of fuel have been pumped");
    }
}
