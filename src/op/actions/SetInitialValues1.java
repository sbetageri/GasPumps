package op.actions;

import data.DataStore1;
import data.IDataStore;

public class SetInitialValues1 implements ISetInitialValues {

    @Override
    public void SetInitialValues(IDataStore iDataStore) {
        DataStore1 dataStore = (DataStore1) iDataStore;
        dataStore.G = 0;
    }
}
