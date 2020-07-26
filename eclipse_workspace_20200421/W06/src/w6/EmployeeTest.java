package w6;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee ahmet = new Employee("Ahmet Can", 30, 1000, 50);
		Employee james = new Employee("James Bond", 50);
		james.salary = 1000; // Employee'deki salary ve workHours private olsaydi bunlar hata verirdi. 
		james.workHours = 30; // Digerleri parameter olarak yazildigi icin onlarda sorun yok. 
		
		ahmet.work();
		ahmet.absence();
		System.out.println(ahmet.salary);
		
		james.work();
		james.absence();
		james.absence();
		System.out.println(james.salary);
		
		
	}

}
