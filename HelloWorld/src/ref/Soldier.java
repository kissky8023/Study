package ref;

public class Soldier {

	public void sleep(SleepParameter parameterObject) {
		System.out.println(parameterObject.getGrade() + " " + parameterObject.getName() + "请示睡觉");
	}

	public void eat(String grade, String name) {
		System.out.println(grade + " " + name + "请示吃饭");
	}
}
