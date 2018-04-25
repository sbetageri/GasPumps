package data;

public class DataStore1 extends IDataStore {
    private static DataStore1 dataStore;

    public float temp_a;
    public float temp_b;
    public String temp_p;
    public String pin;
    public float price;
    public int G;
    public float total;
    public float RPrice;
    public float DPrice;

    private DataStore1() {

    }

    public static DataStore1 getInstance() {
        if (dataStore == null) {
            dataStore = new DataStore1();
        }
        return dataStore;
    }
}
