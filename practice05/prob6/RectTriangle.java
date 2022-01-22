package prob6;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return this.getHeight() * this.getWidth() / (double) 2;
	}

	@Override
	public double getPerimeter() {
		return this.getHeight() + this.getWidth()
				+ Math.sqrt(Math.pow(this.getHeight(), 2) + Math.pow(this.getWidth(), 2));
	}
}