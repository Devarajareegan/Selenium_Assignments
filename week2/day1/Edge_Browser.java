package week2.day1;

public class Edge_Browser {
	public static void main(String[] args) {
		
	}
	public void launchEdgeBrowser() {
	Browser edgeBrowserLaunch = new Browser();
	edgeBrowserLaunch.launchBrowser("Edge Browser");
	String status = edgeBrowserLaunch.loadUrl();
	System.out.println(status);

}
}