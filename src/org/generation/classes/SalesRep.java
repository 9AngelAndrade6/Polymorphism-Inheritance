package org.generation.classes;

public class SalesRep extends Employee{
	double salesMade;

	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade = salesMade;
	}//constructor SalesRep

	public double getSalesMade() {
		return salesMade;
	}//getSalesMade
	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}//setSalesMade
	
	public void calculateComission(){
		// comission = 0.1 * salesMade
	}//calculateComission

	@Override
	public String toString() {
		return "SalesRep [salesMade=" + salesMade + "]";
	}//toString
		
}//class SalesRep extends Employee
