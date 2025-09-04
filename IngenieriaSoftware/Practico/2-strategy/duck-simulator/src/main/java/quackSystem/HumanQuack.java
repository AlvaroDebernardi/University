package quackSystem;

public class HumanQuack implements QuackBehavior {

	@Override
	public void quack() {
        System.out.println("I'm pretending to be a duck.");
	}
}
