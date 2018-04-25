package op.actions;

public class CancelMsg1 implements ICancelMsg {

    @Override
    public void CancelMsg() {
        System.out.println("Transaction in Gas Pump1 has been cancelled");
    }
}
