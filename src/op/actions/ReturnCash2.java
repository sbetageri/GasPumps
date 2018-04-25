package op.actions;

import data.DataStore1;
import data.DataStore2;
import data.IDataStore;

public class ReturnCash2 implements IReturnCash {

    @Override
    public void ReturnCash(IDataStore iDataStore) {
        DataStore2 dataStore = (DataStore2) iDataStore;
        System.out.println("Cash amount to be returned : " + Float.toString(dataStore.cash - dataStore.total));
    }
}
