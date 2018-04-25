package op.actions;

public class CancelMsg2 implements ICancelMsg{

    @Override
    public void CancelMsg() {
        System.out.println("Transaction in Gas Pump2 has been cancelled");
    }
}
