package biz.sucher.HeadFirst.DesignPatterns.DuckSimulator.Duck.Quack;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}

}
