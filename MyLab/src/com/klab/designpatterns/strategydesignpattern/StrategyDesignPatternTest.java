package com.klab.designpatterns.strategydesignpattern;

import org.mockito.runners.MockitoJUnitRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class StrategyDesignPatternTest {
	
	@Before
	public void setUP() {
		
	}
	
	@Test
	public void testMallarDuck() {
		Duck duck = new MallardDuck();
		
		duck.display();
		duck.swim();
		duck.performFly();
		duck.performQuack();
		
		duck.setFlyBehavior(new FlyRocketPowered());
		duck.performFly();
	}
	
	@Test
	public void testRedHeadDuck() {
		Duck duck = new RedHeadDuck();
		duck.display();
		duck.performFly();
		duck.performQuack();
		duck.swim();
	}
	
	@Test
	public void testRubberDuck() {
		Duck duck = new RubberDuck();
		duck.display();
		duck.performQuack();
		duck.swim();
	}
	
	@Test
	public void testDecoy() {
		Duck duck = new Decoy();
		duck.display();
	}

}
