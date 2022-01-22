package prob2;

import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Goods[] goodsArray = new Goods[3];

		for (int i = 0; i < goodsArray.length; i++) {
			goodsArray[i] = new Goods(scanner.next(), scanner.nextInt(), scanner.nextInt());
		}
		for (int i = 0; i < 3; i++) {
			System.out.printf("%s(가격: %d원)이 %d개 입고 되었습니다.\n", goodsArray[i].getName(), goodsArray[i].getPrice(),
					goodsArray[i].getCount());
		}
		scanner.close();
	}
}