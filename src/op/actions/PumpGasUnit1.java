package op.actions;

import data.DataStore1;
import data.IDataStore;

public class PumpGasUnit1 implements IPumpGasUnit {

    @Override
    public void PumpGasUnit(IDataStore iDataStore) {
        DataStore1 dataStore = (DataStore1) iDataStore;
        dataStore.G += 1;
        dataStore.total = dataStore.price * dataStore.G;
    }
}
