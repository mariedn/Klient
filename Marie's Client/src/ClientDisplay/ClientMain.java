package ClientDisplay;

import ClientDisplay.GUI.ClientUI;
import ClientDisplay.service.ClientService;

public class ClientMain {

	public static void main(String[] args) {
		// Create ClientGUI and add action listeners
//		new ClientGUILogic().run();
		// ClientMain creates and runs ClientGUILogic
		// clientGUIlogic creates and shows ClientGUI
//		System.out.println(ClientService.getInstance().login("krri13ab@student.cbs.dk", "test1")); 
//		System.out.println(ClientService.getInstance().login("test@test.test", "testtest"));
//		System.out.println(ClientService.getInstance().createEvent());
//		ClientService.getInstance().getQuote();
		ClientUI clientUI = new ClientUI();
		clientUI.run();
	}

}
