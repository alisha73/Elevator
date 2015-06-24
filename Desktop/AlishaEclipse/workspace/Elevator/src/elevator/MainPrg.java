package elevator;

public class MainPrg {

	public static void main(String arr[]) 
	{
		// TODO Auto-generated constructor stub
		
		Elevator obj = new Elevator(3);
		
		Building bldg=new Building(3);
		
		obj.move_up();
		obj.move_up();
		obj.move_up();
		obj.move_up();
		obj.move_down();
		obj.move_down();
		obj.move_down();
		obj.move_down();
		
		
		
		
	}

}
