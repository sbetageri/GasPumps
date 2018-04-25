package op.actions;

import data.DataStore2;
import data.IDataStore;

public class PumpGasUnit2 implements IPumpGasUnit {

    @Override
    public void PumpGasUnit(IDataStore iDataStore) {
        DataStore2 dataStore = (DataStore2) iDataStore;
        dataStore.L += 1;
        dataStore.total = dataStore.price * dataStore.L;
    }
}
