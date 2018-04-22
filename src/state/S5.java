package state;

import op.OutputProcessor;
import pil.MetaModel;

public class S5 extends State {
    public S5(MetaModel model, OutputProcessor op) {
        super(model, op);
    }

    @Override
    public void Pump() {
        op.pumpGasUnit();
        op.gasPumpedMsg();
    }

    @Override
    public void StopPump() {
        op.stopMsg();
        model.changeState(STATE_6);
    }
}
