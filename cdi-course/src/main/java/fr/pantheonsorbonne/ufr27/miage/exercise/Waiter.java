package fr.pantheonsorbonne.ufr27.miage.exercise;

import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.BlackCoffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.Coffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.CoffeeFactory;
import fr.pantheonsorbonne.ufr27.miage.exercise.coffee.ExpressoCoffee;
import fr.pantheonsorbonne.ufr27.miage.exercise.machines.CoffeeMachine;
import fr.pantheonsorbonne.ufr27.miage.exercise.machines.ExpressoMachine;

class Waiter {

	private final CoffeeMachine machine;
	
	
	public Waiter(CoffeeMachine machine) {
		super();
		this.machine = machine;
	}


	public Coffee serveCoffee() {
		
		return machine.getCoffee();
	}

}