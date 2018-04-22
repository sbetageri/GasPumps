package state;

import op.OutputProcessor;
import pil.MetaModel;

public class S0 extends State {

    public S0(MetaModel model, OutputProcessor op) {
        super(model, op);
    }

    public void Activate() {
        op.storePrices();
    }

    public void Start() {
        op.m = 1;
        op.payMsg();
        op.initializeData();
        model.changeState(State.STATE_1);
    }

}
