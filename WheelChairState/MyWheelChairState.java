package Wheelchair.State;

public class MyWheelChairState implements ElectricWheelChairState{
	
	@Override
	public void prepareWheelChair(WheelChairContext c) {
		System.out.println("Wheelchair: Medical, Daily, Offroad, Racing");
		c.setElectricWheelChairState(this);
	}
	
	public String toString()
	{
		return "My Wheelchair State\n";
	}

}
