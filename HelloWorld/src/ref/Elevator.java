package ref;

public class Elevator {

	public void work() {
		System.out.println("电梯上下运动");
	}

	public void open() {
		System.out.println("开门");
	}

	public void close() {
		System.out.println("关门");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevator ele = new Elevator();
		Elevator.workAll(ele);
	}

	public static void workAll(Elevator elevator) {
		elevator.open();
		elevator.work();
		elevator.close();
	}

}
