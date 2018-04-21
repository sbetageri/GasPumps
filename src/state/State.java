package state;

import op.OutputProcessor;
import pil.MetaModel;

public abstract class State {
    MetaModel model;
    OutputProcessor op;

    public static final int MIN_STATE_LEVEL = 0;
    public static final int MAX_STATE_LEVEL = 7;

    public static final int STATE_0 = 0;
    public static final int STATE_1 = 1;
    public static final int STATE_2 = 2;
    public static final int STATE_3 = 3;
    public static final int STATE_4 = 4;
    public static final int STATE_5 = 5;
    public static final int STATE_6 = 6;
    public static final int STATE_7 = 7;

    public State(MetaModel model, OutputProcessor op) {
        this.model = model;
        this.op = op;
    }

    public void CancelMsg() {
        System.out.println("Not an allowed action");
    }

    public void DisplayMenu() {
        System.out.println("Not an allowed action");
    }

    public void WrongPinMsg() {
        System.out.println("Not an allowed action");
    }

    public void StorePrices() {
        System.out.println("Not an allowed action");
    }

    public void StorePin() {
        System.out.println("Not an allowed action");
    }

    public void StoreCash() {
        System.out.println("Not an allowed action");
    }

    public void StopMsg() {
        System.out.println("Not an allowed action");
    }

    public void SetPrice() {
        System.out.println("Not an allowed action");
    }

    public void SetInitialValues() {
        System.out.println("Not an allowed action");
    }

    public void ReturnCash() {
        System.out.println("Not an allowed action");
    }

    public void RejectMsg() {
        System.out.println("Not an allowed action");
    }

    public void ReadyMsg() {
        System.out.println("Not an allowed action");
    }

    public void PumpGasUnit() {
        System.out.println("Not an allowed action");
    }

    public void PrintReceipt() {
        System.out.println("Not an allowed action");
    }

    public void PayMsg() {
        System.out.println("Not an allowed action");
    }

    public void InitializeData() {
        System.out.println("Not an allowed action");
    }

    public void GasPumpedMsg() {
        System.out.println("Not an allowed action");
    }

    public void EnterPinMsg() {
        System.out.println("Not an allowed action");
    }

}
