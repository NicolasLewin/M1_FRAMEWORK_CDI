package fr.pantheonsorbonne.ufr27.miage.exercise.machines;

import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.BlackCoffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.CoffeeFactory;


public class BlackCoffeeMachine implements CoffeeMachine {
	@Override
	public BlackCoffee getCoffee() {
		return (BlackCoffee) CoffeeFactory.getInstance().getCoffee(this);
	}
}