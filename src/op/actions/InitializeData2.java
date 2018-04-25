package op.actions;

import data.DataStore2;
import data.IDataStore;

public class InitializeData2 implements IInitializeData {

    @Override
    public void InitializeData(IDataStore data) {
        DataStore2 dataStore = (DataStore2) data;
        dataStore.cash = 0;
    }
}
