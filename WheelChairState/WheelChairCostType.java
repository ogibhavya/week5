package Wheelchair.State;

public class WheelChairCostType implements ElectricWheelChairState {
	
	@Override
	public void prepareWheelChair(WheelChairContext c) {
		System.out.println("Cost: $5 to $10 per use");
		c.setElectricWheelChairState(this);
	}
	
	public String toString()
	{
		return "WheelChair Cost State";
	}
}
