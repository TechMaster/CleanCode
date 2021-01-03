package db_connection.implementation4;

// Lazy initialization thread-safe
public class DBConnection {

    private static DBConnection INSTANCE;

    private DBConnection() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Initialized DB connection");
    }

    public static synchronized DBConnection getInstance() {
        System.out.println("Get DB connection instance");
        if (INSTANCE == null) {
            try {
                INSTANCE = new DBConnection();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return INSTANCE;
    }
}
