package op.actions;

import data.DataStore1;
import data.IDataStore;

public class StorePrices1 implements IStorePrices {
    DataStore1 dataStore;

    public void StorePrices(IDataStore storeData) {
        dataStore = (DataStore1) storeData;
        dataStore.RPrice = dataStore.temp_a;
        dataStore.DPrice = dataStore.temp_b;
    }
}
