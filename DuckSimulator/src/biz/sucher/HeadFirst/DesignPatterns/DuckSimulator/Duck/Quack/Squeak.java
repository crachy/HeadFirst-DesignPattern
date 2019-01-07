package biz.sucher.HeadFirst.DesignPatterns.DuckSimulator.Duck.Quack;

public class Squeak implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
