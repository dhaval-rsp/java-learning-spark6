public class P5_StaticBlock {
    public static void main(String[] args) {
        DatabaseConfig.showDatabaseName();
    }
}

class DatabaseConfig {

    // static db name
    static String databaseName;

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

/*
## `Program 5: Static Block`

Create a class DatabaseConfig with:
	static variable databaseName
	static block that initializes databaseName
	static method showDatabaseName()

Call showDatabaseName() from main method.
 */