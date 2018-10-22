package rushHourDemo;

import java.util.ArrayList;
import aima.core.agent.State;
import aima.core.agent.impl.DynamicAction;
import aima.core.agent.Action;

public class RushHourState implements State {
	public static final int dimension = 6;
	public static Action forward = new DynamicAction("forward");
	public static Action backward = new DynamicAction("backward");
	
	ArrayList<Vehicle> cars = new ArrayList<Vehicle>();
	
	public RushHourState(ArrayList<Vehicle> cars) {
		this.cars = cars;
	}
	
	public boolean isMoveValid(Action where) {
		boolean valid = true;
		for (int i = 0; i < cars.size() && valid; i++) {
			if (where.equals(forward)) {
				if (cars.get(i).getOrientation().equals(Orientation.HORIZONTAL_LEFT)) {
					if (cars.get(i).getPositionX() - 1 < 0) {
						valid =false;
					}
				}
			}
			else {
				
			}
		}
	}
	
	
	
	
	
	
}
