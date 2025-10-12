package week3.day2_Assignments;

public class API_Client {
	public void sendRequest(String endPoint ) {
		System.out.println("Sending a Request to Endpoint "+ endPoint);
	}
	public void sendRequest(String endPoint, String requestBody, Boolean requestStatus) {
		System.out.println("Sending a Request to Endpoint "+endPoint);
		System.out.println("Request Body "+ requestBody);
		System.out.println("Request Status is not Successful "+ requestStatus);
	}
	public static void main(String[] args) {
		API_Client client = new API_Client();
		client.sendRequest("https:api.client.com/data");
		client.sendRequest("https:api.client.com/data/auth", "{\\\"client\\\":\\\"testleaf\\\"}" , false);
	}
}
