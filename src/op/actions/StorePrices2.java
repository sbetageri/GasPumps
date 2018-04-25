package op.actions;

import data.DataStore2;
import data.IDataStore;

public class StorePrices2 implements IStorePrices{
    DataStore2 dataStore;

    @Override
    public void StorePrices(IDataStore storeData2) {
        dataStore = (DataStore2) storeData2;
        dataStore.SPrice = dataStore.temp_a;
        dataStore.RPrice = dataStore.temp_b;
        dataStore.PPrice = dataStore.temp_c;
    }
}
