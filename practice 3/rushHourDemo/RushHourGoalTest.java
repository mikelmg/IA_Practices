package rushHourDemo;

import aima.core.search.framework.problem.GoalTest;

public class RushHourGoalTest implements GoalTest {
	
	
	public boolean isRushHourGoalState(Vehicle redCar, RushHourState state) {
		return (RushHourState.gatePosition[0] == redCar.getPositionX() && RushHourState.gatePosition[1] == redCar.getPositionY());
	}

	@Override
	public boolean isGoalState(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
