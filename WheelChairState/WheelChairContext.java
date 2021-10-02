package Wheelchair.State;

public class WheelChairContext {
	ElectricWheelChairState chair;
	
	public void setElectricWheelChairState(ElectricWheelChairState chair)
	{
		this.chair = chair;
	}
	
	public ElectricWheelChairState getElectricWheelChairState()
	{
		return chair;
	}

}
