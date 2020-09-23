package fr.pantheonsorbonne.ufr27.miage.exercise.machines;

import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.CoffeeFactory;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.ExpressoCoffee;


public class ExpressoMachine implements CoffeeMachine {
	public ExpressoCoffee getCoffee() {
		return (ExpressoCoffee) CoffeeFactory.getInstance().getCoffee(this);
	}
}