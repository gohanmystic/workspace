package JavaTrain;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
	abstract double getArea();

	abstract String getName();
}

abstract class TwoDimensionalShape extends Shape {

}

abstract class ThreeDimensionalShape extends Shape {
	abstract double getColume();
}

class Circle extends TwoDimensionalShape {
	private double radius;
	final String name = "circle";

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}

	@Override
	String getName() {
		return this.name;
	}
}

class Square extends TwoDimensionalShape {
	private double edge;
	final String name = "square";

	public Square(double edge) {
		this.edge = edge;
	}

	@Override
	double getArea() {
		return Math.pow(edge, 2);
	}

	@Override
	String getName() {
		return this.name;
	}
}

class Triangle extends TwoDimensionalShape {
	private double bottomEdge;
	private double height;
	final String name = "triangle";

	public Triangle(double bottomEdge, double height) {
		this.bottomEdge = bottomEdge;
		this.height = height;
	}

	@Override
	double getArea() {
		return (bottomEdge * height) / 2;
	}

	@Override
	String getName() {
		return this.name;
	}

}

class Sphere extends ThreeDimensionalShape {
	private double radius;
	final String name = "sphere";

	public Sphere(double radius) {
		this.radius = radius;
	}

	@Override
	double getColume() {
		return (Math.pow(radius, 3) * Math.PI * 4) / 3;
	}

	@Override
	double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}

	@Override
	String getName() {
		return this.name;
	}
}

class Cube extends ThreeDimensionalShape {
	final String name = "cube";
	private double edge;

	public Cube(double edge) {
		this.edge = edge;
	}

	@Override
	double getColume() {
		return Math.pow(edge, 3);
	}

	@Override
	double getArea() {
		return Math.pow(edge, 2);
	}

	@Override
	String getName() {
		return this.name;
	}
}

// tu dien deu
class Tetrahedron extends ThreeDimensionalShape {
	private double edge;
	final String name = "tetrahedron";

	public Tetrahedron(double edge) {
		this.edge = edge;
	}

	@Override
	double getColume() {
		return (Math.pow(edge, 3) * Math.sqrt(2)) / 12;
	}

	@Override
	double getArea() {
		return (Math.pow(edge, 2) * Math.sqrt(3)) / 2;
	}

	@Override
	String getName() {
		return this.name;
	}

}

public class JavaTrain {

	public static void main(String[] args) {

		Circle circle = new Circle(2);
		Square square = new Square(3);
		Triangle triangle = new Triangle(2, 4);
		Sphere sphere = new Sphere(2);
		Cube cube = new Cube(2.3);
		Tetrahedron tetrahedron = new Tetrahedron(3);
		
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(circle);
		shapes.add(square);
		shapes.add(triangle);
		shapes.add(sphere);
		shapes.add(cube);
		shapes.add(tetrahedron);
		
		/// instanceof: kiểm tra xem một đối tượng có thuộc về lớp, lớp con, hoặc interface hay không

		for (Shape shape : shapes) {
			if (shape instanceof TwoDimensionalShape) {
				System.out.println("Area of " + shape.getName() + " = " + shape.getArea());
			} else if (shape instanceof ThreeDimensionalShape) {
				System.out.println("Area of " + shape.getName() + " = " + shape.getArea());
				System.out.println("Colume of " + shape.getName() + " = " + ((ThreeDimensionalShape) shape).getColume());
			}
		}
	}

}
