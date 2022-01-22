package prob3;

public class Duck extends Bird {

	public Duck() {
		// TODO Auto-generated constructor stub
	}

	protected void fly() {
		System.out.printf("오리(%s)는 날지 않습니다.\n", this.getName());
	}

	protected void sing() {
		System.out.printf("오리(%s)가 소리내어 웁니다.\n", this.getName());
	}

	public String toString() {
		return String.format("오리의 이름은 %s입니다.", this.getName());
	}
}