package biz.sucher.HeadFirst.DesignPatterns.DuckSimulator;

import biz.sucher.HeadFirst.DesignPatterns.DuckSimulator.Duck.Duck;
import biz.sucher.HeadFirst.DesignPatterns.DuckSimulator.Duck.MallardDuck;
import biz.sucher.HeadFirst.DesignPatterns.DuckSimulator.Duck.ModelDuck;
import biz.sucher.HeadFirst.DesignPatterns.DuckSimulator.Duck.Fly.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main (String [] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();
	}
}
