package org.generation;

import org.generation.classes.SalesManager;
import org.generation.classes.SalesRep;

public class Main {

	public static void main(String[] args) {
		SalesManager manager = new SalesManager("Michael", "Scott", 1000, 45, 152, 0, 950.25, 15, 0);
		
		manager.addSalesrep(new SalesRep("Freedom", "Rivas", 2502, 21, 125, 1, 250.20, 3, 0));
		manager.addSalesrep(new SalesRep("Angel", "Andrade", 2502, 21, 125, 1, 250.20, 3, 0));
		manager.addSalesrep(new SalesRep("Luis", "Hernandez", 2502, 21, 125, 1, 250.20, 3, 0));
		manager.addSalesrep(new SalesRep("Freedom", "Rivas", 2502, 21, 125, 1, 250.20, 3, 0));
		
	}//main

}//class Main
