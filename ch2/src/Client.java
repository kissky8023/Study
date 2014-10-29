import proxy.AbstractSubject;
import proxy.ProxySubject;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractSubject abstractSubject = new ProxySubject();
		abstractSubject.SayHello();
	}

}
