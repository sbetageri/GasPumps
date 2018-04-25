package data;

public class DataStore2 extends IDataStore{
    private static DataStore2 dataStore;

    public float temp_a;
    public float temp_b;
    public float temp_c;
    public float temp_cash;
    public float SPrice;
    public float RPrice;
    public float PPrice;
    public float cash;
    public float total;
    public int L;
    public float price;

    private DataStore2() {

    }

    public static DataStore2 getInstance() {
        if (dataStore == null) {
            dataStore = new DataStore2();
        }
        return dataStore;
    }

}
