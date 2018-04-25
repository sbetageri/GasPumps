package op.actions;

import data.DataStore1;
import data.IDataStore;
import pil.MetaModel;

public class SetPrice1 implements ISetPrice {
    DataStore1 dataStore;

    @Override
    public void setDataStore(IDataStore iDataStore) {
        dataStore = (DataStore1) iDataStore;
    }

    @Override
    public void SetPrice(int g, int m) {
        if (g == MetaModel.FUEL_TYPE_REGULAR) {
            dataStore.price = dataStore.RPrice;
        } else if (g == MetaModel.FUEL_TYPE_DIESEL) {
            dataStore.price = dataStore.DPrice;
        }
    }
}
