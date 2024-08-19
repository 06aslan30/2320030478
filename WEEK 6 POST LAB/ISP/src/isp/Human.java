package isp;

public class Human implements Worker, Eater {

	@Override
	public void eat() {
		   System.out.println("Human is eating...");

	}

	@Override
	public void work() {
		   System.out.println("Human is working...");
	}

}
