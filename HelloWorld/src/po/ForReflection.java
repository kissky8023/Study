package po;


import java.util.HashMap;

public class ForReflection {

	private HashMap<String,String> caches = new HashMap<String, String>();
	public void execute(String message){
		String b = this.toString()+message;
		caches.put(b, message);
	}
}
