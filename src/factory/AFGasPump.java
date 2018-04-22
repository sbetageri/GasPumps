package factory;

import data.IDataStore;
import op.actions.*;

public abstract class AFGasPump {

    public abstract IDataStore getDataStoreObj();

    public abstract ICancelMsg getCancelMsgObj();

    public abstract IDisplayMenu getDisplayMenuObj();

    public abstract IEnterPinMsg getEnterPinMsgObj();

    public abstract IGasPumpedMsg getGasPumpedMsgObj();

    public abstract IInitializeData getInitializeDataObj();

    public abstract IPayMsg getPayMsgObj();

    public abstract IPrintReceipt getPrintReceiptObj();

    public abstract IPumpGasUnit getPumpGasUnitObj();

    public abstract IReadyMsg getReadyMsgObj();

    public abstract IRejectMsg getRejectMsgObj();

    public abstract IReturnCash getReturnCashObj();

    public abstract ISetInitialValues getSetInitialValuesObj();

    public abstract ISetPrice getSetPriceObj();

    public abstract IStopMsg getStopMsgObj();

    public abstract IStoreCash getStoreCashObj();

    public abstract IStorePin getStorePinObj();

    public abstract IStorePrices getStorePricesObj();

    public abstract IWrongPinMsg getWrongPinMsgObj();

}
