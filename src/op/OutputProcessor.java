package op;

import factory.AFGasPump;
import op.actions.*;

public class OutputProcessor {
    ICancelMsg cancelMsg;
    IDisplayMenu displayMenu;
    IEnterPinMsg enterPinMsg;
    IGasPumpedMsg gasPumpedMsg;
    IInitializeData initializeData;
    IPayMsg payMsg;
    IPrintReceipt printReceipt;
    IPumpGasUnit pumpGasUnit;
    IReadyMsg readyMsg;
    IRejectMsg rejectMsg;
    IReturnCash returnCash;
    ISetInitialValues setInitialValues;
    ISetPrice setPrice;
    IStopMsg stopMsg;
    IStoreCash storeCash;
    IStorePrices storePrices;
    IWrongPinMsg wrongPinMsg;

    AFGasPump gasPump;


    public OutputProcessor(AFGasPump concreteGasPump) {
        gasPump = concreteGasPump;
    }

    public void cancelMsg() {
        cancelMsg = gasPump.getCancelMsgObj();
        cancelMsg.CancelMsg();
    }

    public void storePrices() {
        storePrices = gasPump.getStorePricesObj();
        storePrices.StorePrices();
    }
}
