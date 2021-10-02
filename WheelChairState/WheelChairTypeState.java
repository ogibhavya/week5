package Wheelchair.State;

public class WheelChairTypeState implements ElectricWheelChairState {
	
	@Override
	public void prepareWheelChair(WheelChairContext c) {
		System.out.println("WheelChair Types: Manual, Inhouse, OP, OPT ");
		c.setElectricWheelChairState(this);
	}
	
	public String toString() 
	{
		return "Chair Types State\n";
	}



}
