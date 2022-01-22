package prob6;

public class Rectangle extends Shape implements Resizable {
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

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double s) {
		this.setHeight(this.getHeight() * s);
		this.setWidth(this.getWidth() * s);
	}

	@Override
	public double getArea() {
		return this.getHeight() * this.getWidth();
	}

	@Override
	public double getPerimeter() {
		return 2 * (this.getHeight() + this.getWidth());
	}
}