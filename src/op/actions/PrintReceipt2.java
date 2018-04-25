package op.actions;

import data.DataStore2;
import data.IDataStore;

public class PrintReceipt2 implements IPrintReceipt {

    @Override
    public void PrintReceipt(IDataStore iDataStore) {
        DataStore2 dataStore = (DataStore2) iDataStore;
        System.out.println("Number of Liters pumped  : " + Integer.toString(dataStore.L));
        System.out.println("Total                    : " + Float.toString(dataStore.total));
    }
}
