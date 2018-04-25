package pumps;

import data.DataStore2;
import pil.MetaModel;

public class GasPump2 {
    MetaModel model;
    DataStore2 dataStore;

    public GasPump2() {
        model = new MetaModel(MetaModel.GAS_PUMP_2);
        dataStore = DataStore2.getInstance();
    }

    public void Activate(float a, float b, float c) {
        if (a > 0 && b > 0 && c > 0) {
            dataStore.temp_a = a;
            dataStore.temp_b = b;
            dataStore.temp_c = c;
            model.activate();
        }
    }

    public void PayCash(int c) {
        if (c > 0) {
            dataStore.temp_cash = c;
            model.Start();
            model.PayType(MetaModel.PAY_TYPE_CASH);
        }
    }

    public void PayCredit() {
        model.Start();
        model.PayType(MetaModel.PAY_TYPE_CREDIT);
    }

    public void Approved() {
        model.Approved();
    }

    public void Reject() {
        model.Reject();
    }

    public void Cancel() {
        model.Cancel();
    }

    public void Premium() {
        model.SelectGas(MetaModel.FUEL_TYPE_PREMIUM);
    }

    public void Regular() {
        model.SelectGas(MetaModel.FUEL_TYPE_REGULAR);
    }

    public void Super() {
        model.SelectGas(MetaModel.FUEL_TYPE_SUPER);
    }

    public void StartPump() {
        model.StartPump();
    }

    public void PumpLiter() {
        if (dataStore.cash > 0 && (dataStore.cash < dataStore.price * (dataStore.L + 1))) {
            model.StopPump();
        } else {
            model.Pump();
        }
    }

    public void Stop() {
        model.StopPump();
    }

    public void Receipt() {
        model.Receipt();
    }

    public void NoReceipt() {
        model.NoReceipt();
    }
}
