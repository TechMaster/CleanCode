package db_connection.implementation1;

/**
 * Eager initialization
 */
public class DBConnection {

    private static DBConnection INSTANCE = new DBConnection();

    private DBConnection() {
        System.out.println("Initialized DB connection");
    }

    public static DBConnection getInstance() {
        System.out.println("Get DB connection instance");
        return INSTANCE;
    }
}
