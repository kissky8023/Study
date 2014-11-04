import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import service.UserService;

//import com.ys.webservice.client.*;


public class Client {

	/*
	public static void main(String[] args) throws AccessException, RemoteException, NotBoundException {
		// TODO Auto-generated method stub

		Registry registry = LocateRegistry.getRegistry("localhost");
		String name = "UserService";
		UserService user = (UserService)registry.lookup(name);
		System.out.println(user.echo("test echo")); 
	}
	*/
	public static void main(String[] args){
		/*
		UserService userService = new UserService();
		User user  = userService.getUserPort();
		System.out.println(user.echo("webservice test")); 
		*/
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(UserService.class);
		factory.setAddress("http://localhost:9527/UserService");
		
		UserService userService = (UserService)factory.create();
		System.out.println(userService.echo("cxf hello")); 
	}

}
