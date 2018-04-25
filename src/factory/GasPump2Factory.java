package factory;

import data.DataStore2;
import data.IDataStore;
import op.actions.*;

public class GasPump2Factory extends AFGasPump {

    @Override
    public IDataStore getDataStoreObj() {
        return DataStore2.getInstance();
    }

    @Override
    public ICancelMsg getCancelMsgObj() {
        return new CancelMsg2();
    }

    @Override
    public IDisplayMenu getDisplayMenuObj() {
        return new DisplayMenu2();
    }

    @Override
    public IEnterPinMsg getEnterPinMsgObj() {
        return new EnterPinMsg2();
    }

    @Override
    public IGasPumpedMsg getGasPumpedMsgObj() {
        return new GasPumpedMsg2();
    }

    @Override
    public IInitializeData getInitializeDataObj() {
        return new InitializeData2();
    }

    @Override
    public IPayMsg getPayMsgObj() {
        return new PayMsg2();
    }

    @Override
    public IPrintReceipt getPrintReceiptObj() {
        return new PrintReceipt2();
    }

    @Override
    public IPumpGasUnit getPumpGasUnitObj() {
        return new PumpGasUnit2();
    }

    @Override
    public IReadyMsg getReadyMsgObj() {
        return new ReadyMsg2();
    }

    @Override
    public IRejectMsg getRejectMsgObj() {
        return new RejectMsg2();
    }

    @Override
    public IReturnCash getReturnCashObj() {
        return new ReturnCash2();
    }

    @Override
    public ISetInitialValues getSetInitialValuesObj() {
        return new SetInitialValues2();
    }

    @Override
    public ISetPrice getSetPriceObj() {
        return new SetPrice2();
    }

    @Override
    public IStopMsg getStopMsgObj() {
        return new StopMsg2();
    }

    @Override
    public IStoreCash getStoreCashObj() {
        return new StoreCash2();
    }

    @Override
    public IStorePin getStorePinObj() {
        return new StorePin2();
    }

    @Override
    public IStorePrices getStorePricesObj() {
        return new StorePrices2();
    }

    @Override
    public IWrongPinMsg getWrongPinMsgObj() {
        return new WrongPinMsg2();
    }
}
