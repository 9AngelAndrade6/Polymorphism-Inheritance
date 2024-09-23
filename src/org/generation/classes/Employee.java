package org.generation.classes;

public class Employee {
	String firstName;
	String lastName;
	int registration;
	int age;
	int daysWorked;
	int vacationDaysTaken;
	double salary;
	int yearsWorked;
	public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationDaysTaken = vacationDaysTaken;
		this.salary = salary;
		this.yearsWorked = yearsWorked;
	}// contructor employee
	
	public String getFirstName() {
		return firstName;
	}//getFirstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}//setFirstName
	
	public String getLastName() {
		return lastName;
	}//getLastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}//setLastName
	
	public int getRegistration() {
		return registration;
	}//getRegistration
	public void setRegistration(int registration) {
		this.registration = registration;
	}//setRegistration
	
	public int getAge() {
		return age;
	}//getAge
	public void setAge(int age) {
		this.age = age;
	}//setAge
	
	public int getDaysWorked() {
		return daysWorked;
	}//getDaysWorked
	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}//setDaysWorked
	
	public int getVacationDaysTaken() {
		return vacationDaysTaken;
	}//getVacationDaysTaken
	public void setVacationDaysTaken(int vacationDaysTaken) {
		this.vacationDaysTaken = vacationDaysTaken;
	}//setVacationDaysTaken
	
	public double getSalary() {
		return salary;
	}//getSalary
	public void setSalary(double salary) {
		this.salary = salary;
	}//setSalary
	
	public int getYearsWorked() {
		return yearsWorked;
	}//getYearsWorked
	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}//setYearsWorked

	 public void timeToRetirement(){
	      // time to retirement = min(60 - age, 40 - yearsWorked)
	   }//timeToRetirement
	 public void vacationTimeLeft(){
	       // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
	   }//vacationTimeLeft
	 public void calculateBonus(){
	       // bonus = 2.2*salary
	   }//calculateBonus

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", age=" + age + ", daysWorked=" + daysWorked + ", vacationDaysTaken=" + vacationDaysTaken
				+ ", salary=" + salary + ", yearsWorked=" + yearsWorked + "]";
	}//toString
		 
}//class Employee
