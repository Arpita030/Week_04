package junit.testing_beforeeach_and_aftereach_annotations;


public class DatabaseConnection {
    private boolean isConnected;

    // Simulates establishing a database connection
    public void connect() {
        isConnected = true;
        System.out.println("Database connected.");
    }

    // Simulates closing the database connection
    public void disconnect() {
        isConnected = false;
        System.out.println("Database disconnected.");
    }

    public boolean isConnected() {
        return isConnected;
    }
}
