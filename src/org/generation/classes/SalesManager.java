package org.generation.classes;

import java.util.HashMap;

public class SalesManager extends SalesRep {
HashMap <Integer, SalesRep> salesTeam = new HashMap<>();
	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
	}// SalesManager constructor
	
	public HashMap<Integer, SalesRep> getSalesTeam() {
		return salesTeam;
	}//getSalesTeam
	public void setSalesTeam(HashMap<Integer, SalesRep> salesTeam) {
		this.salesTeam = salesTeam;
	}//setSalesTeam
	
	public void calculateComission(){
	// 0.03 * all sales made by team
	}//calculateComission

}//class SalesManager extends SalesRep
