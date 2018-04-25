package pumps;

import data.DataStore1;
import pil.MetaModel;

public class GasPump1 {
    private MetaModel model;
    DataStore1 dataStore;

    public GasPump1() {
        model = new MetaModel(MetaModel.GAS_PUMP_1);
        dataStore = DataStore1.getInstance();
    }

    public void Activate(float a, float b) {
        if (a > 0 && b > 0) {
            dataStore.temp_a = a;
            dataStore.temp_b = b;
            model.activate();
        }
    }

    public void Start() {
        model.Start();
    }

    public void PayCredit() {
        model.PayType(MetaModel.PAY_TYPE_CREDIT);
    }

    public void Reject() {
        model.Reject();
    }

    public void PayDebit(String p) {
        dataStore.temp_p = p;
        model.PayType(MetaModel.PAY_TYPE_DEBIT);
    }

    public void Cancel() {
        model.Cancel();
    }

    public void Approved() {
        model.Approved();
    }

    public void Diesel() {
        model.SelectGas(MetaModel.FUEL_TYPE_DIESEL);
    }

    public void Regular() {
        model.SelectGas(MetaModel.FUEL_TYPE_REGULAR);
    }

    public void StartPump() {
        if (dataStore.price > 0) {
            model.Continue();
            model.StartPump();
        }
    }

    public void PumpGallon() {
        model.Pump();
    }

    public void StopPump() {
        model.StopPump();
    }

    public void FullTank() {
        model.StopPump();
        model.Receipt();
    }

    public void Pin(String x) {
        if (dataStore.pin.equals(x)) {
            model.CorrectPin();
        } else {
            model.IncorrectPin();
        }
    }
}
