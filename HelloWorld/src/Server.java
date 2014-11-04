/*
import java.rmi.AccessException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import javax.xml.ws.Endpoint;
import javax.jws.WebService;
*/

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import service.UserService;
import service.impl.UserServiceImpl;


public class Server {

	
	public static void main(String[] args) {
		/*
		Endpoint.publish("http://localhost:9527/UserService", new UserServiceImpl());
		System.out.println("server start.");
		*/
		UserService userService = new UserServiceImpl();
		JaxWsServerFactoryBean svrFactory = new JaxWsServerFactoryBean();
		svrFactory.setServiceClass(UserService.class);
		svrFactory.setAddress("http://localhost:9527/UserService");
		svrFactory.setServiceBean(userService);
		svrFactory.create();
		
	}
	
	/*
	public static void main(String[] args) throws AccessException, RemoteException {
		// TODO Auto-generated method stub

		int port = 9527;
		String name ="UserService";
		UserService user = new UserServiceImpl();
		UnicastRemoteObject.exportObject(user, port);
		Registry registry = LocateRegistry.createRegistry(1099);
		registry.rebind(name,user);
	}
	*/

}
