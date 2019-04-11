/*
 * Author:	Diana Ramirez
 * Created:	4.11.19
 * 
 */
public class human {
	public int age;
	public int food;
	public double wealth;
	public double hunger;
	public String name;
	public boolean hasVehicle;	
	
	public void eat() {
		if(food>0) 
			hunger--;
		else 
			System.out.println("Not enough food, please buy food");
	}
	public void grow( ) {
		age++;
	}
	public void work( ) {
		if(hunger<5)
			wealth += 10.5;
		else
			System.out.println("Too hungry to work");
	}
	public void buyFood( ) {
		if(wealth>5) {
			wealth -= 4.5;
			food ++;
		}
		else {
			System.out.println("Not enough money, please work");
		}
	}
}
	
