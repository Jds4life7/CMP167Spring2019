/*
 * Author:	Diana Ramirez
 * Created:	4.11.19
 * 
 */
public class human {
	public int age;		// They belong to the object, they are calling
	public int food;
	public double wealth;
	public double hunger;
	public String name;
	public boolean hasVehicle;
	public vehicle[] vehicles;

	public human() { //Constructor new Human();
		this.age		= 0;	//this refers to the object
		this.name		= "";
		this.wealth		= 0.0;
		this.hasVehicle	= false;
		this.hunger		= 5.0;
		this.food		= 5;
		this.vehicles	= new vehicle[100]; 	//array of vehicles
	}
	public int numberOfVehicles() {
		int total = 0;
		for(int i=0; i<vehicles.length; i++) {
			if(vehicles[i] != null)
				total++;
			else
				break;
		}
		return total;
	}
	
	public void eat() {
		if(food>4.5) {
			hunger 	-= 1.0;
			food 	-= 1;
			System.out.println("Yummy, I ate all");
		}
		else 
			System.out.println("Not enough food, please buy food");
	}

	public void grow( ) {
		age++;
	}
	public void work( ) {
		if(hunger<5) {
			wealth += 10.5;
			hunger += 0.5;
			System.out.println("Woah, I worked a lot");
		}
		else
			System.out.println("Too hungry to work");
	}

	public void buyFood( ) {
		if(wealth>5) {
			wealth -= 4.5;
			food ++;
			System.out.println("Yoohoo, I bought some food");
		}
		else {
			System.out.println("Not enough money, please work");
		}
	}
}

	