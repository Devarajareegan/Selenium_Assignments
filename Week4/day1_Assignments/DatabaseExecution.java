package week4.day1_Assignments;

public class DatabaseExecution implements DatabaseConnection{
	// Provide implementation for connect method
   

    // Main method to test the implementation
    public static void main(String[] args) {
        DatabaseExecution dbConnection = new DatabaseExecution();
        dbConnection.connect();
        dbConnection.executeUpdate();
        dbConnection.disconnect();
    }

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		
	}
	 
}
