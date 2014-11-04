package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.jws.WebService;

/*
public interface UserService extends Remote {

//	public boolean login(String username, String password);
	
	public String echo(String message) throws RemoteException;
}
*/

@WebService
public interface UserService{

	
	public String echo(String message);
}
