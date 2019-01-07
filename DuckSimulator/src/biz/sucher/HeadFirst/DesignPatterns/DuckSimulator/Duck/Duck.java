package biz.sucher.HeadFirst.DesignPatterns.DuckSimulator.Duck;

import biz.sucher.HeadFirst.DesignPatterns.DuckSimulator.Duck.Fly.FlyBehaviour;
import biz.sucher.HeadFirst.DesignPatterns.DuckSimulator.Duck.Quack.QuackBehaviour;

public abstract class Duck {
	private FlyBehaviour flyBehaviour;
	private QuackBehaviour quackBehaviour;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void swim () {
		System.out.println("All ducks float, evene decoys!");
	}
	
	
	
	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public QuackBehaviour getQuackBehaviour() {
		return quackBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
}
