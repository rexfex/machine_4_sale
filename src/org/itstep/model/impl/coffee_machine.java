package org.itstep.model.impl;
import org.itstep.model.method_of_sale;

public class coffee_machine implements method_of_sale {
	
	private int cash;
	private int quantity;
    private String tovar, late, capuchino, americano;
   
	@Override
	public void product() {
		
		
	}
	
  
public void setCash(int cash) {
	this.cash = cash;
 }
public void setTovar(String tovar) {
	this.tovar = tovar;
 }
}
