package pumps;

import pil.MetaModel;

public class GasPump1 {
    private MetaModel model;

    public GasPump1() {
        model = new MetaModel(MetaModel.GAS_PUMP_1);
    }

    public void Activate(float a, float b) {
        model.activate();
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
