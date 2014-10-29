//import java.util.Date;

import po.MyInterface;
import po.Teacher;


public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		//Date date = new Date();
		
		MyInterface stu = new Teacher("张三",20,true);
		stu.say();
	}

}
