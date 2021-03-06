package state;

import op.OutputProcessor;
import pil.MetaModel;

public class S1 extends State {

    public S1(MetaModel model, OutputProcessor op) {
        super(model, op);
    }

    @Override
    public void PayType(int t) {
        System.out.println("Paytype");
        if (t == MetaModel.PAY_TYPE_CREDIT) {
            model.changeState(STATE_2);

        } else if (t == MetaModel.PAY_TYPE_CASH) {
            op.storeCash();
            op.displayMenu();
            model.m = MetaModel.PAYMENT_CASH;
            model.changeState(STATE_3);

        } else if (t == MetaModel.PAY_TYPE_DEBIT) {
            op.enterPinMsg();
            op.storePin();
            model.changeState(STATE_7);

        }
    }

}
