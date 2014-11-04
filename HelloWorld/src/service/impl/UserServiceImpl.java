package service.impl;

import java.rmi.RemoteException;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import service.UserService;

/*
@WebService(name="User",serviceName="UserService",targetNamespace="http://WebService.ys.com/client")
@SOAPBinding(style=SOAPBinding.Style.RPC)
*/

@WebService(serviceName="UserService",endpointInterface="com.ys.cxf.user")


public class UserServiceImpl implements UserService {

	/*
	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	*/

//	public String echo(String message) throws RemoteException{
	public String echo(String message){
		if ("quit".equalsIgnoreCase(message)) {
			System.out.println("System will shutdown.");
			System.exit(0);
		}
		
		System.out.println("client message:"+message);
		return "server response:"+message;
	}
}
