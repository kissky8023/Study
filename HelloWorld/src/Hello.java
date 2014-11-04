//import java.util.Date;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

import po.ForReflection;
import po.MyInterface;
import po.Teacher;
//import po.cac;


public class Hello {

	private static final int WARMUP_COUNT=10700;
	private ForReflection testClass = new ForReflection();
	private static Method method=null;
	
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		method = ForReflection.class.getMethod("execute", new Class<?>[]{String.class});
		
		Hello demo = new Hello();
		for (int i = 0; i < 20; i++) {
			demo.testDirectCall();
			demo.testCacheMethodCall();
			demo.testNoCacheMethodCall();
		}
		
		long beginTime = System.currentTimeMillis();
		demo.testDirectCall();
		long endTime = System.currentTimeMillis();
		System.out.println("直接："+(endTime-beginTime));
		beginTime =System.currentTimeMillis();
		demo.testCacheMethodCall();
		endTime = System.currentTimeMillis();
		System.out.println("缓存："+(endTime-beginTime));
		beginTime = System.currentTimeMillis();
		demo.testNoCacheMethodCall();
		endTime = System.currentTimeMillis();
		System.out.println("没缓存："+(endTime-beginTime));
		
		System.out.println("Hello World!");
		//Date date = new Date();
		
		MyInterface stu = new Teacher("张三",20,true);
		stu.say();
	}

	private void testNoCacheMethodCall() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		for (int i = 0; i < WARMUP_COUNT; i++) {
			Method testMethod = ForReflection.class.getMethod("execute", new Class<?>[]{String.class});
			testMethod.invoke(testClass, new Object[]{"hello"});
		}
	}

	private void testCacheMethodCall() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		for (int i = 0; i < WARMUP_COUNT; i++) {
			method.invoke(testClass, new Object[]{"hello"});
		}
	}

	public void testDirectCall(){
		for (int i = 0; i < WARMUP_COUNT; i++) {
			testClass.execute("hello");
		}
	}
	
}


