package state;

import op.OutputProcessor;
import pil.MetaModel;

public class S0 extends State {

    public S0(MetaModel model, OutputProcessor op) {
        super(model, op);
    }

    public void StorePrices() {
        op.storePrices();
    }

}
