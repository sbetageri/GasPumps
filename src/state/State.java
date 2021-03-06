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
    public static final int STATE_START = 8;

    public State(MetaModel model, OutputProcessor op) {
        this.model = model;
        this.op = op;
    }

    public void Activate() {
        System.out.println("Activation not allowed");
    }

    public void Start() {
        System.out.println("Starting not allowed");
    }

    public void PayType(int t) {
        System.out.println("PayType not allowed");
    }

    public void Reject() {
        System.out.println("Reject not allowed");
    }

    public void Cancel() {
        System.out.println("Cancel not allowed");
    }

    public void Approved() {
        System.out.println("Approved not allowed");
    }

    public void StartPump() {
        System.out.println("StartPump not allowed");
    }

    public void Pump() {
        System.out.println("Pump not allowed");
    }

    public void StopPump() {
        System.out.println("StopPump not allowed");
    }

    public void SelectGas(int g) {
        System.out.println("Select Gas not allowed");
    }

    public void Receipt() {
        System.out.println("Receipt not allowed");
    }

    public void NoReceipt() {
        System.out.println("NoReceipt not allowed");
    }

    public void CorrectPin() {
        System.out.println("CorrectPin not allowed");
    }

    public void IncorrectPin() {
        System.out.println("Incorrect pin not allowed");
    }

    public void Continue() {
        System.out.println("Continue not allowed");
    }
}
