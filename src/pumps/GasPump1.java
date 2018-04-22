package pumps;

import data.DataStore1;
import pil.MetaModel;
import state.State;

public class GasPump1 {
    private MetaModel model;
    DataStore1 dataStore;

    public GasPump1() {
        model = new MetaModel(MetaModel.GAS_PUMP_1);
        dataStore = DataStore1.getInstance();
    }

    public void Activate(float a, float b) {
        dataStore.setTempPrices(a, b);
        model.activate();
    }

    public void Start() {
        model.Start();
        model.changeState(State.STATE_1);
    }

    public void PayCredit() {

    }

    public void Reject() {

    }

    public void PayDebit(String p) {

    }

    public void Cancel() {

    }

    public void Approved() {

    }

    public void Diesel() {

    }

    public void Regular() {

    }

    public void StartPump() {

    }

    public void PumpGallon() {

    }

    public void StopPump() {

    }

    public void FullTank() {

    }
}
