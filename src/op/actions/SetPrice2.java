package op.actions;

import data.DataStore2;
import data.IDataStore;
import pil.MetaModel;

public class SetPrice2 implements ISetPrice {
    DataStore2 dataStore;

    @Override
    public void setDataStore(IDataStore iDataStore) {
        dataStore = (DataStore2) iDataStore;
    }

    @Override
    public void SetPrice(int g, int m) {
        if (g == MetaModel.FUEL_TYPE_REGULAR) {
            dataStore.price = dataStore.RPrice;

        } else if (g == MetaModel.FUEL_TYPE_SUPER) {
            dataStore.price = dataStore.SPrice;

        } else if (g == MetaModel.FUEL_TYPE_PREMIUM) {
            dataStore.price = dataStore.PPrice;
        }

        if (m == MetaModel.PAYMENT_CREDIT) {
            dataStore.price *= 1.1;
        }
    }
}
