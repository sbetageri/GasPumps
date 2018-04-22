package state;

import op.OutputProcessor;
import pil.MetaModel;

public class S4 extends State {
    public S4(MetaModel model, OutputProcessor op) {
        super(model, op);
    }

    @Override
    public void StartPump() {
        op.setInitialValues();
        op.readyMsg();
        model.changeState(STATE_5);
    }
}
