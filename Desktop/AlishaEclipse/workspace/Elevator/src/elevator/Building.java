package elevator;

public class Building 
{
	Floor [] floors;
	Elevator lift;
	
	public Building(int no_floors) 
	{
		// TODO Auto-generated constructor stub
		floors=new Floor[no_floors];
		for(Integer i=0;i<no_floors;i++)
		{
			floors[i]=new Floor(i);
		}
		lift=new Elevator(no_floors);
	}
}
