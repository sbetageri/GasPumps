package factory;

import data.DataStore1;
import data.IDataStore;
import op.actions.*;

public class GasPump1Factory extends AFGasPump {

    @Override
    public IDataStore getDataStoreObj() {
        return DataStore1.getInstance();
    }

    @Override
    public ICancelMsg getCancelMsgObj() {
        return new CancelMsg1();
    }

    @Override
    public IDisplayMenu getDisplayMenuObj() {
        return new DisplayMenu1();
    }

    @Override
    public IEnterPinMsg getEnterPinMsgObj() {
        return new EnterPinMsg1();
    }

    @Override
    public IGasPumpedMsg getGasPumpedMsgObj() {
        return new GasPumpedMsg1();
    }

    @Override
    public IInitializeData getInitializeDataObj() {
        return new InitializeData1();
    }

    @Override
    public IPayMsg getPayMsgObj() {
        return new PayMsg1();
    }

    @Override
    public IPrintReceipt getPrintReceiptObj() {
        return new PrintReceipt1();
    }

    @Override
    public IPumpGasUnit getPumpGasUnitObj() {
        return new PumpGasUnit1();
    }

    @Override
    public IReadyMsg getReadyMsgObj() {
        return new ReadyMsg1();
    }

    @Override
    public IRejectMsg getRejectMsgObj() {
        return new RejectMsg1();
    }

    @Override
    public IReturnCash getReturnCashObj() {
        return new ReturnCash1();
    }

    @Override
    public ISetInitialValues getSetInitialValuesObj() {
        return new SetInitialValues1();
    }

    @Override
    public ISetPrice getSetPriceObj() {
        return new SetPrice1();
    }

    @Override
    public IStopMsg getStopMsgObj() {
        return new StopMsg1();
    }

    @Override
    public IStoreCash getStoreCashObj() {
        return new StoreCash1();
    }

    @Override
    public IStorePin getStorePinObj() {
        return new StorePin1();
    }

    @Override
    public IStorePrices getStorePricesObj() {
        return new StorePrices1();
    }

    @Override
    public IWrongPinMsg getWrongPinMsgObj() {
        return new WrongPinMsg1();
    }
}
