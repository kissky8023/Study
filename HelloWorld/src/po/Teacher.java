package po;

public class Teacher implements MyInterface {

	private String name;
	private int age;
	private boolean sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (sex ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex != other.sex)
			return false;
		return true;
	}
	public Teacher(String name, int age, boolean sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	/* (non-Javadoc)
	 * @see po.MyInterface#say()
	 */
	@Override
	public void say(){
		System.out.println("我的名称:"+name+",我的年龄:"+age);
		
	}
}
