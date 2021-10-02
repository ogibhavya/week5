package Wheelchair.State;

public class WheelChairTestDemo {

	public static void main(String[] args) {
		WheelChairContext wc=new WheelChairContext();
		WheelChairTypeState type =new WheelChairTypeState();
		type.prepareWheelChair(wc);
		System.out.println(wc.getElectricWheelChairState().toString());
		
		MyWheelChairState cds=new MyWheelChairState();
		cds.prepareWheelChair(wc);
		System.out.println(wc.getElectricWheelChairState().toString());
		
		WheelChairCostType cost = new WheelChairCostType();
		cost.prepareWheelChair(wc);
		System.out.println(wc.getElectricWheelChairState().toString());
	
		}

}
