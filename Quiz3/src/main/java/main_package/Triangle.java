package main_package;


public class Triangle extends GeometricObject {
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	
	public Triangle(){
		System.out.print("Triangle sides are: "+getSide1()+","+getSide2()+","+getSide3()+". Area: "+getArea()+". Perimiter: "+getPerimeter());
		toString();
	}
	
	public Triangle(int side1, int side2, int side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		System.out.print("Triangle sides are: "+getSide1()+","+getSide2()+","+getSide3()+". Area: "+getArea()+". Perimiter: "+getPerimeter());
		toString();
		}
	
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	public double getPerimeter(){
		return (this.getSide1() + this.getSide2() + this.getSide3());
	}
	
	public double getArea(){
		double s = .5*getPerimeter();
		return Math.sqrt(s*(s-getSide1())*(s-getSide2())*(s*getSide3()));
	}

	
}
