package data;

public class DataStore1 extends IDataStore {
    private static DataStore1 dataStore;

    float temp_a;
    float temp_b;
    public String temp_p;
    String pin;
    public float price;
    int G;
    float total;
    float RPrice;
    float DPrice;

    public static DataStore1 getInstance() {
        if (dataStore == null) {
            dataStore = new DataStore1();
        }
        return dataStore;
    }

    public void setTempPrices(float a, float b) {
        temp_a = a;
        temp_b = b;
    }

    public void StorePrices() {
       RPrice = temp_a;
       DPrice = temp_b;
    }

}
