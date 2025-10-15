package week4.day1_Assignments;

public class JavaConnection2 extends MySqlConnection{

	@Override
	public void connect() {
		System.out.println("Connecting to the MySql database...");
		
	}

	@Override
	public void disconnect() {
		System.out.println("DisConnecting from the MySql database...");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Executing the Update on the MySql database...");
		
	}

	@Override
	void executeQuery() {
		System.out.println("Executing Query into MySql database...");
		
	}
	public static void main(String[] args) {
		JavaConnection2 mySql = new JavaConnection2();
		mySql.connect();
		mySql.executeUpdate();
		mySql.executeQuery();
		mySql.disconnect();
	}
	

}
