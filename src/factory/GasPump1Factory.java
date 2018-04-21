package factory;

import op.actions.*;

public class GasPump1Factory extends AFGasPump {

    @Override
    public ICancelMsg getCancelMsgObj() {
        return new CancelMsg1();
    }

    @Override
    public IDisplayMenu getDisplayMenuObj() {
        return null;
    }

    @Override
    public IEnterPinMsg getEnterPinMsgObj() {
        return null;
    }

    @Override
    public IGasPumpedMsg getGasPumpedMsgObj() {
        return null;
    }

    @Override
    public IInitializeData getInitializeDataObj() {
        return null;
    }

    @Override
    public IPayMsg getPayMsgObj() {
        return null;
    }

    @Override
    public IPrintReceipt getPrintReceiptObj() {
        return null;
    }

    @Override
    public IPumpGasUnit getPumpGasUnitObj() {
        return null;
    }

    @Override
    public IReadyMsg getReadyMsgObj() {
        return null;
    }

    @Override
    public IRejectMsg getRejectMsgObj() {
        return null;
    }

    @Override
    public IReturnCash getReturnCashObj() {
        return null;
    }

    @Override
    public ISetInitialValues getSetInitialValuesObj() {
        return null;
    }

    @Override
    public ISetPrice getSetPriceObj() {
        return null;
    }

    @Override
    public IStopMsg getStopMsgObj() {
        return null;
    }

    @Override
    public IStoreCash getStoreCashObj() {
        return null;
    }

    @Override
    public IStorePin getStorePinObj() {
        return null;
    }

    @Override
    public IStorePrices getStorePricesObj() {
        return new StorePrices1();
    }

    @Override
    public IWrongPinMsg getWrongPinMsgObj() {
        return null;
    }
}
