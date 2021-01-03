package db_connection.implementation2;

// Static block
public class DBConnection {

    private static DBConnection INSTANCE;

    static {
        try {
            INSTANCE = new DBConnection();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private DBConnection() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Initialized DB connection");
    }

    public static DBConnection getInstance() {
        System.out.println("Get DB connection instance");
        return INSTANCE;
    }
}
