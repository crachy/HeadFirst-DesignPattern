package biz.sucher.HeadFirst.DesignPatterns.DuckSimulator.Duck;

import biz.sucher.HeadFirst.DesignPatterns.DuckSimulator.Duck.Fly.FlyNoWay;
import biz.sucher.HeadFirst.DesignPatterns.DuckSimulator.Duck.Quack.Quack;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		setFlyBehaviour(new FlyNoWay());
		setQuackBehaviour(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("I'm a model Duck");
	}

}
