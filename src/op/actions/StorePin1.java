package op.actions;

import data.DataStore1;
import data.IDataStore;

public class StorePin1 implements IStorePin {

    @Override
    public void StorePin(IDataStore iDataStore) {
        DataStore1 dataStore1 = (DataStore1) iDataStore;
        dataStore1.pin = dataStore1.temp_p;
    }
}
