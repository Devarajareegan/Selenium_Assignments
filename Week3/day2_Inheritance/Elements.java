package week3.day2_Inheritance;

public class Elements {
public static void main(String[] args) {
	WebElement webElement = new WebElement();
	System.out.println("WebElement");
	webElement.click();
	
	Button button = new Button();
	System.out.println("Button");
	button.click();
	button.submit();;
	
	TextField textField = new TextField();
	System.out.println("Text Field");
	textField.click();
	textField.setText("Inheritance fron the Parent Class");
	String text = textField.getText();
	System.out.println("Text from the TextField" +text);
	
	ClickCheckButton checkBoxButton = new ClickCheckButton();
	System.out.println("Click Check Button");
	checkBoxButton.click();
	checkBoxButton.clickCheckButton();
	
	RadioButton radiButton = new RadioButton();
	System.out.println("Radio Button");
	radiButton.click();
	radiButton.selectRadioButton();
}
}
