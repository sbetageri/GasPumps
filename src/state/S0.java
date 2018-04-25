package state;

import op.OutputProcessor;
import pil.MetaModel;

public class S0 extends State {

    public S0(MetaModel model, OutputProcessor op) {
        super(model, op);
    }

    @Override
    public void Activate() {
        op.storePrices();
    }

    @Override
    public void Start() {
        model.m = MetaModel.PAYMENT_CREDIT;
        op.payMsg();
        op.initializeData();
        System.out.println("Starting");
        model.changeState(State.STATE_1);
    }

}
