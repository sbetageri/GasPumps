package state;

import op.OutputProcessor;
import pil.MetaModel;

public class StartState extends State {

    public StartState(MetaModel model, OutputProcessor op) {
        super(model, op);
    }

    @Override
    public void Activate() {
        op.storePrices();
        model.changeState(STATE_0);
    }
}
