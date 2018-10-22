package rushHourDemo;


public class Vehicle {
	
	private int headPositionX;
	private int headPositionY;
	private int length;
	private Orientation orientation;
	
	
	public Vehicle (int headPositionX, int headPositionY, int length, Orientation orientation) {
	
		this.headPositionX = headPositionX; 
		this.headPositionY = headPositionY; 
		this.length = length;
		this.orientation = orientation;
		
		
		
		
	}
	
	public Orientation getOrientation() {
		return this.orientation;
	}
	public int getLength() {
		return this.length;
	}
	public int getPositionX() {
		return this.headPositionX;
	}
	public int getPositionY() {
		return this.headPositionY;
	}
	public void setPositionX(int positionX) {
		this.headPositionX = positionX;
	}
	public void setPositionY(int positionY) {
		this.headPositionY = positionY;
	}
}
