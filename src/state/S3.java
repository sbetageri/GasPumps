package state;

import op.OutputProcessor;
import pil.MetaModel;

public class S3 extends State {
    public S3(MetaModel model, OutputProcessor op) {
        super(model, op);
    }

    @Override
    public void SelectGas(int g) {
        op.setPrice(g, model.m);
    }

    @Override
    public void Continue() {
        model.changeState(STATE_4);
    }

    @Override
    public void Cancel() {
        op.cancelMsg();
        op.returnCash();
        model.changeState(STATE_0);
    }
}
