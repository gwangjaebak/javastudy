package prob5;

public class Prob5 {

	public static void main(String[] args) {
		for (int i=1; i<100; i++) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
					System.out.println(i + " 짝짝");
				}else {
					System.out.println(i + " 짝");
				}
			}
			if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
				System.out.println(i + " 짝");
		}
		
	}
	}
}
