package db_connection.implementation2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Singleton {

    public static void main(String[] args) {
        int concurrent = 5;
        ExecutorService executor = Executors.newFixedThreadPool(concurrent);
        for (int i = 0; i < concurrent; i++) {
            executor.submit(DBConnection::getInstance);
        }
        executor.shutdown();
    }
}
