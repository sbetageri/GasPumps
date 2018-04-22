package op;

import data.IDataStore;
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
    IStorePin storePin;
    IStorePrices storePrices;
    IWrongPinMsg wrongPinMsg;

    AFGasPump gasPump;
    IDataStore dataStore;

    public OutputProcessor(AFGasPump concreteGasPump) {
        gasPump = concreteGasPump;
        dataStore = gasPump.getDataStoreObj();
    }

    public void cancelMsg() {
        cancelMsg = gasPump.getCancelMsgObj();
        cancelMsg.CancelMsg();
    }

    public void storePrices() {
        storePrices = gasPump.getStorePricesObj();
        storePrices.StorePrices();
    }

    public void payMsg() {
        payMsg = gasPump.getPayMsgObj();
    }

    public void displayMenu() {
        displayMenu = gasPump.getDisplayMenuObj();
        displayMenu.DisplayMenu();
    }

    public void enterPinMsg() {
        enterPinMsg = gasPump.getEnterPinMsgObj();
        enterPinMsg.EnterPinMsg();
    }

    public void gasPumpedMsg() {
        gasPumpedMsg = gasPump.getGasPumpedMsgObj();
        gasPumpedMsg.GasPumpedMsg();
    }

    public void initializeData() {
        initializeData = gasPump.getInitializeDataObj();
        initializeData.InitializeData(dataStore);
    }

    public void printReceipt() {
        printReceipt = gasPump.getPrintReceiptObj();
        printReceipt.PrintReceipt();
    }

    public void pumpGasUnit() {
        pumpGasUnit = gasPump.getPumpGasUnitObj();
        pumpGasUnit.PumpGasUnit();
    }

    public void readyMsg() {
        readyMsg = gasPump.getReadyMsgObj();
        readyMsg.ReadyMsg();
    }

    public void rejectMsg() {
        rejectMsg = gasPump.getRejectMsgObj();
        rejectMsg.RejectMsg();
    }

    public void returnCash() {
        returnCash = gasPump.getReturnCashObj();
        returnCash.ReturnCash();
    }

    public void setInitialValues() {
        setInitialValues = gasPump.getSetInitialValuesObj();
        setInitialValues.SetInitialValues();
    }

    public void setPrice(int g, int m) {
        setPrice = gasPump.getSetPriceObj();
        setPrice.SetPrice();
    }

    public void stopMsg() {
        stopMsg = gasPump.getStopMsgObj();
        stopMsg.StopMsg();
    }

    public void storeCash() {
        storeCash = gasPump.getStoreCashObj();
        storeCash.StoreCash();
    }

    public void wrongPinMsg() {
        wrongPinMsg = gasPump.getWrongPinMsgObj();
        wrongPinMsg.WrongPinMsg();
    }

    public void storePin() {
        storePin = gasPump.getStorePinObj();
        storePin.StorePin();
    }
}
