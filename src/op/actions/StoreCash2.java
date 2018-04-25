package op.actions;

import data.DataStore2;
import data.IDataStore;

public class StoreCash2 implements IStoreCash {

    @Override
    public void StoreCash(IDataStore iDataStore) {
        DataStore2 dataStore = (DataStore2) iDataStore;
        dataStore.cash = dataStore.temp_cash;
    }
}
