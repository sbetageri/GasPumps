import data.DataStore1;
import data.IDataStore;
import pumps.GasPump1;

public class Driver {

    public static void main(String[] args) {
        GasPump1 gasPump1 = new GasPump1();
        gasPump1.Activate(9, 9);
        gasPump1.Start();
        gasPump1.PayCredit();
        gasPump1.Reject();
        gasPump1.PayDebit("Sai");
        gasPump1.Pin("Sai");
        gasPump1.Cancel();
        gasPump1.Approved();
        gasPump1.Diesel();
        gasPump1.Regular();
        gasPump1.StartPump();
        gasPump1.PumpGallon();
        gasPump1.StopPump();
        gasPump1.FullTank();

    }

}
