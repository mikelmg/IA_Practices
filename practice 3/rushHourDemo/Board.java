package rushHourDemo;
import java.util.ArrayList;
import rushHourDemo.Vehicle;

public class Board {
	
	private boolean[][] board = new boolean [RushHourState.dimension][RushHourState.dimension];
	
	public Board(ArrayList<Vehicle> vehicle) {
		
		//Init false
		for (int i=0; i< RushHourState.dimension; i++) {
			for (int j =0; j <RushHourState.dimension; j++) {
				board[i][j]= false;
			}
		}
		
		//Fill board
		
		for (int i =0; i< vehicle.size(); i++) {//Recorre cada uno de los coches
			
			if(vehicle.get(i).getOrientation().equals(Orientation.HORIZONTAL_LEFT)) {
				for (int j =0; j < vehicle.get(i).getLength(); j++) {
					board[vehicle.get(i).getPositionX()+j][vehicle.get(i).getPositionY()]= true;
				}
			}
			
			if(vehicle.get(i).getOrientation().equals(Orientation.HORIZONTAL_RIGHT)) {
				for (int j =0; j < vehicle.get(i).getLength(); j++) {
					board[vehicle.get(i).getPositionX()-j][vehicle.get(i).getPositionY()]= true;
				}
			}
			
			if(vehicle.get(i).getOrientation().equals(Orientation.VERTICAL_UP)) {
				for (int j =0; j < vehicle.get(i).getLength(); j++) {
					board[vehicle.get(i).getPositionX()][vehicle.get(i).getPositionY()+j]= true;
				}
			}
			
			if(vehicle.get(i).getOrientation().equals(Orientation.VERTICAL_DOWN)) {
				for (int j =0; j < vehicle.get(i).getLength(); j++) {
					board[vehicle.get(i).getPositionX()][vehicle.get(i).getPositionY()-j]= true;
				}
			}
		}
	}
	
	public void moveLeft(Vehicle vehicle) {
		
		setPositionFull(vehicle.getPositionX()-1, vehicle.getPositionY());
		setPositionEmpty(vehicle.getPositionX()+vehicle.getLength()-2, vehicle.getPositionY());	
	}
	
	public void moveRight(Vehicle vehicle) {
		
		setPositionFull(vehicle.getPositionX()+1, vehicle.getPositionY());
		setPositionEmpty(vehicle.getPositionX()-vehicle.getLength()+2, vehicle.getPositionY());	
	}
	
	public void moveUp(Vehicle vehicle) {

		setPositionFull(vehicle.getPositionX(), vehicle.getPositionY()+1);
		setPositionEmpty(vehicle.getPositionX(), vehicle.getPositionY()+vehicle.getLength()-2);
	}
	
	public void moveDown(Vehicle vehicle) {
		
		setPositionFull(vehicle.getPositionX()+1, vehicle.getPositionY());
		setPositionEmpty(vehicle.getPositionX(), vehicle.getPositionY()-vehicle.getLength()+2);
	}
	
	public boolean moveValid(Vehicle vehicle, ) {
		
		boolean result = true;
		
		
	}
	
	private boolean getPositionFull (int x, int y) {
		return board[x][y];
	}
	
	private void setPositionFull (int x, int y) {
		board[x][y]=true;
	}
	
	private void setPositionEmpty (int x, int y) {
		board[x][y]=false;
	}
	
}
