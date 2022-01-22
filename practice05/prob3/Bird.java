package prob3;

public abstract class Bird {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bird(String name) {
		this.name = name;
	}

	protected abstract void fly();

	protected abstract void sing();

	public Bird() {
		super();
	}

}