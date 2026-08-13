public class P5_StaticBlock {
    public static void main(String[] args) {
        DatabaseConfig.showDatabaseName();
    }
}

class DatabaseConfig {

    static String databaseName; // static db name

    // static block to initiate db name
    static {
        databaseName = "StudentDB";
        System.out.println("Static block executed: Database initialized.");
    }

    // static method to get db name
    public static void showDatabaseName() {
        System.out.println("Database Name = " + databaseName);
    }
}

