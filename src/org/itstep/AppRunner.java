package org.itstep;

import org.itstep.model.impl.coffee_machine;
import org.itstep.model.impl.drink_machine;
import org.itstep.model.impl.vending_machine;

public class AppRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coffee_machine coffee = new coffee_machine();
		coffee.setCash(10);
		coffee.setTovar("capuchino");
		coffee.product();
		
		vending_machine vend = new vending_machine();
		vend.setCash(10);
		vend.setTovar("chips");
		vend.product();
		
		drink_machine drink =new drink_machine();
		drink.setCash(10);
		drink.setTovar("cola");
		drink.product();
	}

}
