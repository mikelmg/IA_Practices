package rushHourDemo;

import java.util.ArrayList;
import aima.core.agent.State;
import aima.core.agent.impl.DynamicAction;
import aima.core.agent.Action;

public class RushHourState implements State {
	
	//Actions
	public static Action up = new DynamicAction("up");
	public static Action down = new DynamicAction("down");
	public static Action left = new DynamicAction("left");
	public static Action right = new DynamicAction("right");
	
	//Attributes
	public static final int dimension = 6;
	public static final int gatePosition[] = {6, 3};

	private ArrayList<Vehicle> cars = new ArrayList<Vehicle>();
	private Board board = new Board(cars);
	
	
	public RushHourState(ArrayList<Vehicle> cars) {
		this.cars = cars;
		
		
		
		
		
		
	}
	
	public boolean isMoveValid(Action where) {
		boolean valid = true;
		for (int i = 0; i < cars.size() && valid; i++) {
			if (where.equals(forward)) {
				if (cars.get(i).getOrientation().equals(Orientation.HORIZONTAL_LEFT)) {
					if (cars.get(i).getPositionX() + 1 > ) {
						valid =false;
					}
				}
			}
			else {
				
			}
		}
	}
	
	private boolean isColiding(Vehicle car) {
		
		
	}
	
	
	
	
	
	
}
