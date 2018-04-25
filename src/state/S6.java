package state;

import op.OutputProcessor;
import pil.MetaModel;

public class S6 extends State{
    public S6(MetaModel model, OutputProcessor op) {
        super(model, op);
    }

    @Override
    public void Receipt() {
        System.out.println("Printing Receipt");
        op.printReceipt();
        op.returnCash();
        model.changeState(STATE_0);
    }
}
