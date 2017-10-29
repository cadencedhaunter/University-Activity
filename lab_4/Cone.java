package lab_4;

import java.io.Serializable;

public class Cone implements Serializable {
	 
	private float baseRadius;
	private float height;
	
	private static final double PI = 3.1415;
	
	Cone(){}
	
	Cone(float baseRadius, float height){
		this.baseRadius = baseRadius;
		this.height = height;
	}
	
	public double getArea()  {
		double hypotenuse = Math.sqrt((height*height) + (baseRadius*baseRadius));
		return (PI * baseRadius * (baseRadius + hypotenuse));
	}
	
	
	public void setHeight(float height) throws IllegalConeArgumentException {
		if (height<0) { throw new IllegalConeArgumentException(IllegalConeArgumentException.EXCEPTION_NEGATIVE_VALUE); }
		this.height = height;
	}
	
	public void setBaseRadius(float radius) throws IllegalConeArgumentException {
		if (radius<0) { throw new IllegalConeArgumentException(IllegalConeArgumentException.EXCEPTION_NEGATIVE_VALUE);}
		baseRadius = radius;
	}
	
	public float getBaseRadius() {
		return baseRadius;
	}
	
	public float getHeight() {
		return height;
	}
	
	public String toString() {
		return "Area of cone with radius: " + baseRadius +
			   "; height: " + height + 
			   "; is: " + getArea();
	}
}
