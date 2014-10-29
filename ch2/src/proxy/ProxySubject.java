package proxy;

public class ProxySubject implements AbstractSubject {

	private RealSubject realSubject;

	public void SayHello() {
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
		realSubject.SayHello();
	}

}
