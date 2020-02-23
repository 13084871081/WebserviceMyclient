package demo;

import java.rmi.RemoteException;

public class TestClient {

	public static void main(String[] args) throws RemoteException {
		
		Helloservice service = new HelloserviceProxy();
		String text = service.hello("地瓜");
		System.out.println(text);
		
	}

}
