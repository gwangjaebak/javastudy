package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		
		/* 코드 작성 */
		
		for(int i=1; i<=9; i++) {
			for(int j=i; j<=i+9; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
