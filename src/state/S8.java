package state;

import op.OutputProcessor;
import pil.MetaModel;

public class S8 extends State {
    public S8(MetaModel model, OutputProcessor op) {
        super(model, op);
    }

    @Override
    public void CorrectPin() {
        op.displayMenu();
        model.changeState(STATE_3);
    }

    @Override
    public void IncorrectPin() {
        op.wrongPinMsg();
        model.changeState(STATE_0);
    }
}
