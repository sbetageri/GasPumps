package state;

import op.OutputProcessor;
import pil.MetaModel;

public class S2 extends State {
    public S2(MetaModel model, OutputProcessor op) {
        super(model, op);
    }

    @Override
    public void Reject() {
        op.rejectMsg();
        model.changeState(STATE_1);
    }

    @Override
    public void Approved() {
        op.displayMenu();
        model.changeState(STATE_3);
    }
}
