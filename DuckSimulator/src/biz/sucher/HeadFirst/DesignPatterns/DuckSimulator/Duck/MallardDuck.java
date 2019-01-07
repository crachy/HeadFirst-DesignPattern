package biz.sucher.HeadFirst.DesignPatterns.DuckSimulator.Duck;

import biz.sucher.HeadFirst.DesignPatterns.DuckSimulator.Duck.Fly.FlyWithWings;
import biz.sucher.HeadFirst.DesignPatterns.DuckSimulator.Duck.Quack.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck () {
		setQuackBehaviour(new Quack());
		setFlyBehaviour(new FlyWithWings());
	}
	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

}
