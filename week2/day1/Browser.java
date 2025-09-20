package week2.day1;

public class Browser {
	
	public void launchBrowser(String browserName) {
		System.out.println(browserName);

	}
	
	public String loadUrl() {
		return "Url loaded Successfully";

	}
	public static void main(String[] args) {
		Browser myBrowser = new Browser();
		myBrowser.launchBrowser("Chrome");
		String urlStatus = myBrowser.loadUrl();
		System.out.println(urlStatus);
		
		Edge_Browser edge = new Edge_Browser();
		edge.launchEdgeBrowser();
		

	}

}
