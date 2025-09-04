package duck;

import flySystem.*;
import quackSystem.*;

public class HumanDuck extends Duck {

    public HumanDuck() {
        flyBehavior = new Plane();
        quackBehavior = new HumanQuack();
    }

	@Override
	void display() {
        System.out.println("Hello I'm the duck Juan Carlos");
	}

    
}
