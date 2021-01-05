package db_connection.implementation3;

/**
 * Lazy initialization non thread-safe
 */
public class DBConnection {

    private static DBConnection INSTANCE;

    private DBConnection() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Initialized DB connection");
    }

    public static DBConnection getInstance() {
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
