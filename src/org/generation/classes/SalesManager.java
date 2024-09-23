package org.generation.classes;

import java.util.HashMap;

public class SalesManager extends SalesRep {

	private HashMap <Integer, SalesRep> salesTeam;

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
	
	public double calculateComission(){
		double total = 0;
		for (SalesRep salesRep: salesTeam.values()) {
			total += salesRep.getSalesMade();
		}//foreach
		return 0.03 * total;
	}//calculateComission

	public void addSalesrep(SalesRep salesRep) {
		salesTeam.put(salesRep.getRegistration(), salesRep);
	}//addSalesrep
	
	public SalesRep getSalesrep(int registration) {
		return salesTeam.get(registration);
	}//getSalesrep
	
	
	public void printSalesTeamInfo() {
		for(SalesRep salesRep: salesTeam.values()) {
			System.out.println(salesRep.toString() +
			salesRep.calculateBonus() + salesRep.getVacationDaysTaken());		
		}
	} 
	
	
}//class SalesManager extends SalesRep
