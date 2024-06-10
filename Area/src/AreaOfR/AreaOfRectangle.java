package AreaOfR;

public class AreaOfRectangle {

	private int length, width;

	public void setDim(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getArea(){
		return length*width;
	}	
}
