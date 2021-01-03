package singleton.implementation5;

// Lazy initialization double check locking
public class DBConnection {

    private static volatile DBConnection INSTANCE;

    private DBConnection() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Initialized DB connection");
    }

    public static DBConnection getInstance() {
        System.out.println("Get DB connection instance");
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    try {
                        INSTANCE = new DBConnection();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return INSTANCE;
    }
}
