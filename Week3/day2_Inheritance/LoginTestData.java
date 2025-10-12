package week3.day2_Inheritance;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("Username has been entered");
	}
	public void enterPassword() {
		System.out.println("Passowrd has been entered");
	}
	public static void main(String[] args) {
		LoginTestData login = new LoginTestData();
		login.enterCredentials();
		login.enterUsername();
		login.enterPassword();
		login.navigateToHome();
	}
}
