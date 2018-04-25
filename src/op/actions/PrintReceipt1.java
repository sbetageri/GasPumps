package op.actions;

import data.DataStore1;
import data.IDataStore;

public class PrintReceipt1 implements IPrintReceipt {

    @Override
    public void PrintReceipt(IDataStore iDataStore) {
        DataStore1 dataStore = (DataStore1) iDataStore;
        System.out.println("Number of Gallons pumped : " + Integer.toString(dataStore.G));
        System.out.println("Total                    : " + Float.toString(dataStore.total));
    }
}
