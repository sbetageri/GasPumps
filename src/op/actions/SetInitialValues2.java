package op.actions;

import data.DataStore1;
import data.DataStore2;
import data.IDataStore;

public class SetInitialValues2 implements ISetInitialValues {

    @Override
    public void SetInitialValues(IDataStore iDataStore) {
        DataStore2 dataStore = (DataStore2) iDataStore;
        dataStore.L = 0;
    }
}
