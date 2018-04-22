import data.DataStore1;
import data.IDataStore;
import pumps.GasPump1;

public class Driver {

    public static void main(String[] args) {
        /*
            decide which GasPump
            provide options for gaspumps
            enact the actions.
         */
        GasPump1 gasPump1 = new GasPump1();
        gasPump1.Activate(9, 9);
        gasPump1.Start();
    }

}
