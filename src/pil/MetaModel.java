package pil;

import factory.AFGasPump;
import factory.GasPump1Factory;
import factory.GasPump2Factory;
import op.OutputProcessor;
import state.*;

public class MetaModel {

    public static final int GAS_PUMP_1 = 1;
    public static final int GAS_PUMP_2 = 2;

    OutputProcessor op;
    State[] states = new State[8];
    State curState;

    public MetaModel(int gp) {
        AFGasPump gasPump;
        if (gp == 1) {
            gasPump = new GasPump1Factory();
        } else {
            gasPump = new GasPump2Factory();
        }
        op = new OutputProcessor(gasPump);
        initializeStates();
        curState = states[0];
    }

    private void initializeStates() {
        states[0] = new S0(this, op);
        states[1] = new S1(this, op);
        states[2] = new S2(this, op);
        states[3] = new S3(this, op);
        states[4] = new S4(this, op);
        states[5] = new S5(this, op);
        states[6] = new S6(this, op);
        states[7] = new S7(this, op);
    }

    public void changeState(int newState) {
        if (newState >= State.MIN_STATE_LEVEL &&
                newState <= State.MAX_STATE_LEVEL) {
            curState = states[newState];
        }
    }

    public void activate() {
        curState.StorePrices();
    }
}
