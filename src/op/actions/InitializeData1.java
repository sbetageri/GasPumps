package op.actions;

import data.DataStore1;
import data.IDataStore;

public class InitializeData1 implements IInitializeData {

    @Override
    public void InitializeData(IDataStore dataStore) {
        DataStore1 dataStore1 = (DataStore1) dataStore;
        dataStore1.price = 0;
    }
}
