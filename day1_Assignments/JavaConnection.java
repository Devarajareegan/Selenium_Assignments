package week4.day1_Assignments;

public class JavaConnection implements DatabaseConnection{
	// Provide implementation for connect method
   @Override
   public void connect() {
	   System.out.println("Connecting to the database...");
}
   @Override
   public void disconnect() {
	   System.out.println("Disconnecting from the database...");
	
}
   @Override
   public void executeUpdate() {
	   System.out.println("Executing update on the database...");
	
}

    // Main method to test the implementation
    public static void main(String[] args) {
        JavaConnection endOutput = new JavaConnection();
        endOutput.connect();
        endOutput.executeUpdate();
        endOutput.disconnect();
    }
	 
}
