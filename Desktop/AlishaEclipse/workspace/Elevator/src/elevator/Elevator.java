
package elevator;

public class Elevator {
	int current_floor;
	int no_floors;
	public Elevator(int no_floors) 
	{
		// TODO Auto-generated constructor stub
		this.current_floor=0;
		this.no_floors=no_floors;
		
	}
	
	public void move_up()
	{
		System.out.println("The elevator is on the way up...");
		if(current_floor==no_floors)
		{
			System.out.println("Top Floor");
		}
		else
		{
			current_floor++;
			System.out.println("you reached floor = "+current_floor);
		}
	}
	public void move_down()
	{
		System.out.println("The elevator is on the way down...");
		if(current_floor==0)
		{
			System.out.println("Ground Floor");
		}
		else
		{
			current_floor--;
			System.out.println("you reached floor = "+current_floor);
		}
	}
}
